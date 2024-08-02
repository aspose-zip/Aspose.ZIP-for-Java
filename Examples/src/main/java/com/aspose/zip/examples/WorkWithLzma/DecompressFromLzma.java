/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkWithLzma;

import com.aspose.zip.LzmaArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileOutputStream;

public class DecompressFromLzma {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressFromLzma.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressFromLzma.class);

        try (LzmaArchive archive = new LzmaArchive(dataDir + "archive.lzma")) {
            try (FileOutputStream extracted = new FileOutputStream(outDir + "alice29_out.txt")) {
                archive.extract(extracted);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Successfully Opened Lzma Archive");
    }
}