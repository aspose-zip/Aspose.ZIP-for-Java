/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithLzArchives;

import com.aspose.zip.LzipArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressLzFile {
    public static void main(String[] args) {
        System.out.println("--------" + CompressLzFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressLzFile.class);

        // ExStart: CompressFile
        try (LzipArchive archive = new LzipArchive()) {
            archive.setSource(dataDir + "alice29.txt");
            archive.save(outDir + "archive.lz");
        }
        // ExEnd: CompressFile
        System.out.println("Successfully Compressed a File");
    }
}