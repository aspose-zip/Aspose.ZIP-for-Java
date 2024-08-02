/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.RarExtraction;

import com.aspose.zip.RarArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class DecompressRarArchive {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressRarArchive.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressRarArchive.class);

        //ExStart: DecompressRarArchive
        try (FileInputStream fs = new FileInputStream(dataDir + "plrabn12.rar")) {
            RarArchive archive = new RarArchive(fs);
            archive.extractToDirectory(outDir + "DecompressRar_out");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressRarArchive
    }
}
