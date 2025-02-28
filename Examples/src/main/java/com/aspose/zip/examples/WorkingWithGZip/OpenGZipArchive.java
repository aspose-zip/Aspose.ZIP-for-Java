/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithGZip;

import com.aspose.zip.GzipArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class OpenGZipArchive {
    public static void main(String[] args) {
        System.out.println("--------" + OpenGZipArchive.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(OpenGZipArchive.class);

        // Extracts the archive and copies extracted content to file stream.
        try (GzipArchive archive = new GzipArchive(dataDir + "sample.gz")) {
            try (FileOutputStream extracted = new FileOutputStream(new File(outDir + "data.bin"))) {
                InputStream unpacked = archive.open();
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = unpacked.read(buffer, 0, buffer.length)) > 0) {
                    extracted.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Successfully Opened GZip Archive");
    }
}