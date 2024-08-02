/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.RarExtraction;

import com.aspose.zip.RarArchive;
import com.aspose.zip.RarArchiveLoadOptions;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class DecryptRarArchive {
    public static void main(String[] args) {
        System.out.println("--------" + DecryptRarArchive.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecryptRarArchive.class);

        // ExStart: DecryptRarArchive
        try (FileInputStream fs = new FileInputStream(dataDir + "encrypted.rar")) {
            RarArchiveLoadOptions options = new RarArchiveLoadOptions();
            options.setDecryptionPassword("p@s$");
            try (RarArchive archive = new RarArchive(fs, options)) {
                archive.extractToDirectory(outDir + "DecompressRar_out");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: DecryptRarArchive
    }
}