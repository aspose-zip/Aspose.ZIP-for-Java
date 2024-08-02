/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithZArchives;

import com.aspose.zip.ZArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class DecompressZFile {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressZFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressZFile.class);

        // Extracts the archive and copies extracted content to file stream.
        try (ZArchive archive = new ZArchive(dataDir + "archive.z")) {
            try (FileOutputStream extracted = new FileOutputStream(outDir + "alice29_out.txt")) {
                archive.extract(extracted);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Successfully Opened Z Archive");
    }
}