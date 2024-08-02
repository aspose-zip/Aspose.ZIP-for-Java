/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveSaveOptions;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CompressMultipleFiles {
    public static void main(String[] args) {
        System.out.println("--------" + CompressMultipleFiles.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressMultipleFiles.class);

        //ExStart: CompressMultipleFiles
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "CompressMultipleFiles_out.zip")) {
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                try (FileInputStream source2 = new FileInputStream(dataDir + "asyoulik.txt")) {
                    try (Archive archive = new Archive()) {
                        archive.createEntry("alice29.txt", source1);
                        archive.createEntry("asyoulik.txt", source2);
                        ArchiveSaveOptions saveOptions = new ArchiveSaveOptions();
                        saveOptions.setEncoding(StandardCharsets.US_ASCII);
                        saveOptions.setArchiveComment("There are two poems from Canterbury corpus");
                        archive.save(zipFile, saveOptions);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: CompressMultipleFiles
    }
}