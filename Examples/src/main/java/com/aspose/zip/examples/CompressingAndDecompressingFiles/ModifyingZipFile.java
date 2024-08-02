/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntry;
import com.aspose.zip.examples.RunExamples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ModifyingZipFile {

    public static void main(String[] args) {
        System.out.println("--------" + ModifyingZipFile.class.getSimpleName() + "--------");
        //ExStart: ModifyingZipFile
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(ModifyingZipFile.class);

        try (Archive outer = new Archive(dataDir + "outer.zip")) {
            List<ArchiveEntry> entriesToDelete = new ArrayList<>();
            List<String> namesToInsert = new ArrayList<>();
            List<ByteArrayOutputStream> contentToInsert = new ArrayList<>();

            for (ArchiveEntry entry : outer.getEntries()) {
                // Find an entry which is an archive itself
                if (entry.getName().endsWith(".zip")) {
                    // Keep reference to the entry in order to remove it from the archive later
                    entriesToDelete.add(entry);
                    ByteArrayOutputStream innerCompressed = new ByteArrayOutputStream();

                    // This extracts the entry to a byte array output stream
                    RunExamples.copyTo(entry.open(), innerCompressed);

                    // We know that content of the entry is a zip archive so we may extract
                    try (Archive inner = new Archive(new ByteArrayInputStream(innerCompressed.toByteArray()))) {
                        // Loop over entries of inner archive
                        for (ArchiveEntry ie : inner.getEntries()) {
                            // Keep the name of inner entry
                            namesToInsert.add(ie.getName());
                            ByteArrayOutputStream content = new ByteArrayOutputStream();
                            RunExamples.copyTo(ie.open(), content);

                            // Keep the content of inner entry
                            contentToInsert.add(content);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            // Delete all the entries which are archives itself
            for (ArchiveEntry e : entriesToDelete) {
                outer.deleteEntry(e);
            }

            for (int i = 0; i < namesToInsert.size(); i++) {
                // Adds entries which were entries of inner archives
                outer.createEntry(namesToInsert.get(i), new ByteArrayInputStream(contentToInsert.get(i).toByteArray()));
            }

            outer.save(outDir + "flatten.zip");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: ModifyingZipFile
    }
}