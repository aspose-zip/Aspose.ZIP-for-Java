/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithXzArchives;

import com.aspose.zip.XzArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressXzFile {
    public static void main(String[] args) {
        System.out.println("--------" + CompressXzFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressXzFile.class);

        try (XzArchive archive = new XzArchive()) {
            archive.setSource(dataDir + "alice29.txt");
            archive.save(outDir + "archive.xz");
        }

        System.out.println("Successfully Compressed a File");
    }
}