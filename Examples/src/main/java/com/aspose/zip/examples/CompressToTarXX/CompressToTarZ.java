/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressToTarXX;

import com.aspose.zip.TarArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressToTarZ {
    public static void main(String[] args) {
        System.out.println("--------" + CompressToTarZ.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressToTarZ.class);

        //ExStart: CompressFile
        try (TarArchive archive = new TarArchive()) {
            archive.createEntry("alice29.txt", dataDir + "alice29.txt");
            archive.createEntry("lcet10.txt", dataDir + "lcet10.txt");
            archive.saveZCompressed(outDir + "archive.tar.z");
        }
        //ExEnd: CompressFile
    }
}