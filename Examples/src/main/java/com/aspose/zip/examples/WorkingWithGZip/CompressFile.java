/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithGZip;

import com.aspose.zip.GzipArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressFile {
    public static void main(String[] args) {
        System.out.println("--------" + CompressFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressFile.class);

        // ExStart: CompressFile
        try (GzipArchive archive = new GzipArchive()) {
            archive.setSource(dataDir + "data.bin");
            archive.save(outDir + "archive.gz");
        }
        // ExEnd: CompressFile
        System.out.println("Successfully Compressed a File");
    }
}