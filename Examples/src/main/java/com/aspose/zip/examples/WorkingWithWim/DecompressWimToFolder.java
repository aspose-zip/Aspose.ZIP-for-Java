/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithWim;

import com.aspose.zip.WimArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class DecompressWimToFolder {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressWimToFolder.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressWimToFolder.class);

        //ExStart: DecompressWimArchive
        try (FileInputStream fs = new FileInputStream(dataDir + "corpus.wim")) {
            try (WimArchive archive = new WimArchive(fs)) {
                // ToDo: Fix getImages
                //archive.getImages().get(0).extractToDirectory(outDir + "DecompressWim_out");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressWimArchive
    }
}