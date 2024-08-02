/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressToTarXX;

import com.aspose.zip.Bzip2Archive;
import com.aspose.zip.TarArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressToTarBz2 {
    public static void main(String[] args) {
        System.out.println("--------" + CompressToTarBz2.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressToTarBz2.class);

        //ExStart: CompressFile
        try (Bzip2Archive bz2 = new Bzip2Archive()) {
            try (TarArchive archive = new TarArchive()) {
                archive.createEntry("alice29.txt", dataDir + "alice29.txt");
                archive.createEntry("lcet10.txt", dataDir + "lcet10.txt");

                bz2.setSource(archive);
                bz2.save(outDir + "archive.tar.bz2");
            }
        }
        //ExEnd: CompressFile

    }
}