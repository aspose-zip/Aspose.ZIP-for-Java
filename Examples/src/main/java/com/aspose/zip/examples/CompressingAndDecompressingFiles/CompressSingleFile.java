/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompressSingleFile {
    public static void main(String[] args) {
        System.out.println("--------" + CompressSingleFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressSingleFile.class);

        // File stream for the zip file
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "CompressSingleFile_out.zip")) {
            // File to be added to the archive
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                try (Archive archive = new Archive(new ArchiveEntrySettings())) {
                    archive.createEntry("alice29.txt", source1);
                    archive.save(zipFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}