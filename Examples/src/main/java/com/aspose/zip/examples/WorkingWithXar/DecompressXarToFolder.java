/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithXar;

import com.aspose.zip.XarArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class DecompressXarToFolder {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressXarToFolder.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressXarToFolder.class);

        //ExStart: DecompressXarArchive
        try (FileInputStream fis = new FileInputStream(dataDir + "sample.xar")) {
            try (XarArchive archive = new XarArchive(fis)) {
                archive.extractToDirectory(outDir + "DecompressXar_out");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressXarArchive
    }
}