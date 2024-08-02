/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithSevenZip;

import com.aspose.zip.SevenZipArchive;
import com.aspose.zip.examples.RunExamples;

public class CreateSevenZipEntries {
    public static void main(String[] args) {
        System.out.println("--------" + CreateSevenZipEntries.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CreateSevenZipEntries.class);

        // CreateSevenZipEntries
        try (SevenZipArchive archive = new SevenZipArchive()) {
            archive.createEntries(dataDir);
            archive.save(outDir + "SevenZip.7z");
        }
        System.out.println("Successfully Created a Seven Zip File");
    }
}