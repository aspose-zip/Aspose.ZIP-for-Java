/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithCab;

import com.aspose.zip.CabArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DecompressCabToFolder {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressCabToFolder.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressCabToFolder.class);

        //ExStart: DecompressCabArchive
        try (FileInputStream fs = new FileInputStream(new File(dataDir + "corpus.cab"))) {
            CabArchive archive = new CabArchive(fs);
            archive.extractToDirectory(outDir + "DecompressCab_out");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressCabArchive
    }
}