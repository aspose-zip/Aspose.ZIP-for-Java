/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.ArchiveSaveOptions;
import com.aspose.zip.StoreCompressionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoreMultipleFilesWithoutCompression {
    public static void main(String[] args) {
        System.out.println("--------" + StoreMultipleFilesWithoutCompression.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(StoreMultipleFilesWithoutCompression.class);

        //Creates zip archive without compressing files
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "StoreMultipleFilesWithoutCompression_out.zip")) {
            File fi1 = new File(dataDir + "alice29.txt");
            File fi2 = new File(dataDir + "lcet10.txt");

            try (Archive archive = new Archive(new ArchiveEntrySettings(new StoreCompressionSettings()))) {
                archive.createEntry("alice29.txt", fi1);
                archive.createEntry("lcet10.txt", fi2);
                archive.save(zipFile, new ArchiveSaveOptions());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}