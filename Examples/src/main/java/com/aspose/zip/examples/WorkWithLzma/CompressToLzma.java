/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkWithLzma;

import com.aspose.zip.LzmaArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressToLzma {
    public static void main(String[] args) {
        System.out.println("--------" + CompressToLzma.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressToLzma.class);

        try (LzmaArchive archive = new LzmaArchive()) {
            archive.setSource(dataDir + "alice29.txt");
            archive.save(outDir + "archive.lzma");
        }

        System.out.println("Successfully Compressed a File");
    }
}