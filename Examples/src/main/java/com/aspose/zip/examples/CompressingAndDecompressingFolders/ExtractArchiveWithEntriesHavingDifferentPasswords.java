/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFolders;

import com.aspose.zip.Archive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class ExtractArchiveWithEntriesHavingDifferentPasswords {
    public static void main(String[] args) {
        System.out.println("--------" + ExtractArchiveWithEntriesHavingDifferentPasswords.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(ExtractArchiveWithEntriesHavingDifferentPasswords.class);

        try (FileInputStream zipFile = new FileInputStream(dataDir + "\\different_password.zip")) {
            try (Archive archive = new Archive(zipFile)) {
                archive.getEntries().get(0).extract(outDir + "alice29_extracted_pass_out.txt", "first_pass");
                archive.getEntries().get(1).extract(outDir + "asyoulik_extracted_pass_out.txt", "second_pass");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}