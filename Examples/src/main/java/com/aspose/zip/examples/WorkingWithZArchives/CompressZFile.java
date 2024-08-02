/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithZArchives;

import com.aspose.zip.ZArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressZFile {
    public static void main(String[] args) {
        System.out.println("--------" + CompressZFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressZFile.class);

        //ExStart: CompressFile
        try (ZArchive archive = new ZArchive()) {
            archive.setSource(dataDir + "alice29.txt");
            archive.save(outDir + "archive.z");
        }
        //ExEnd: CompressFile
        System.out.println("Successfully Compressed a File");
    }
}