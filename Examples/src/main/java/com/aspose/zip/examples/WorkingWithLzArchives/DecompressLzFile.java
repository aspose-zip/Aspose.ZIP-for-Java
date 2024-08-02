/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithLzArchives;

import com.aspose.zip.LzipArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class DecompressLzFile {
    public static void main(String[] args) {
        System.out.println("--------" + CompressLzFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressLzFile.class);

        // Extracts the archive and copies extracted content to file stream.
        try (LzipArchive archive = new LzipArchive(dataDir + "archive.lz")) {
            try (FileOutputStream extracted = new FileOutputStream(outDir + "alice29_out.txt")) {
                archive.extract(extracted);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Successfully Opened Lz Archive");
    }
}