/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressToTarXX;

import com.aspose.zip.TarArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressToTarXz {
    public static void main(String[] args) {
        System.out.println("--------" + CompressToTarLz.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressToTarLz.class);

        //ExStart: CompressFile
        try (TarArchive archive = new TarArchive()) {
            archive.createEntry("alice29.txt", dataDir + "alice29.txt");
            archive.createEntry("lcet10.txt", dataDir + "lcet10.txt");
            archive.saveXzCompressed(outDir + "archive.tar.xz");
        }
        //ExEnd: CompressFile
    }
}