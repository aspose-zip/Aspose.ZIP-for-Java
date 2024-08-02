/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.RarExtraction;

import com.aspose.zip.RarArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class DecompressRarEntry {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressRarEntry.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressRarEntry.class);

        //ExStart: DecompressRarEntry
        try (FileInputStream fs = new FileInputStream(dataDir + "plrabn12.rar")) {
            try (RarArchive archive = new RarArchive(fs)) {
                archive.getEntries().get(0).extract(outDir + "plrabn12_out.txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressRarEntry
    }
}