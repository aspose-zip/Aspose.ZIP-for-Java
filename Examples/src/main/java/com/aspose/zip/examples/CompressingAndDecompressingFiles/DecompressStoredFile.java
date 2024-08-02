/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecompressStoredFile {

    public static void main(String[] args) {
        System.out.println("--------" + DecompressStoredFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressStoredFile.class);

        System.out.println("-->-");
        StoreMultipleFilesWithoutCompression.main(args); // Create a stored file without compression to be used in decompression
        System.out.println("-<--");

        // ExStart: DecompressStoredFile
        try (FileInputStream zipFile = new FileInputStream(RunExamples.getOutDir(StoreMultipleFilesWithoutCompression.class) + "StoreMultipleFilesWithoutCompression_out.zip")) {
            try (Archive archive = new Archive(zipFile)) {
                try (FileOutputStream extracted = new FileOutputStream(outDir + "alice_extracted_store_out.txt")) {
                    try (InputStream decompressed = archive.getEntries().get(0).open()) {
                        byte[] buffer = new byte[8192];
                        int bytesRead;
                        while ((bytesRead = decompressed.read(buffer, 0, buffer.length)) > 0) {
                            extracted.write(buffer, 0, bytesRead);
                        }
                        // Read from decompressed stream to extracting file.
                    }
                }

                try (FileOutputStream extracted = new FileOutputStream(outDir + "asyoulik_extracted_store_out.txt")) {
                    try (InputStream decompressed = archive.getEntries().get(1).open()) {
                        byte[] buffer = new byte[8192];
                        int bytesRead;
                        while ((bytesRead = decompressed.read(buffer, 0, buffer.length)) > 0) {
                            extracted.write(buffer, 0, bytesRead);
                        }
                        // Read from decompressed stream to extracting file.
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: DecompressStoredFile
    }
}