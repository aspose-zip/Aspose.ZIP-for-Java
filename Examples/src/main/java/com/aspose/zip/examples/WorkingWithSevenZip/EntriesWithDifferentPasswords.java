/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithSevenZip;

import com.aspose.zip.SevenZipAESEncryptionSettings;
import com.aspose.zip.SevenZipArchive;
import com.aspose.zip.SevenZipEntrySettings;
import com.aspose.zip.SevenZipStoreCompressionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EntriesWithDifferentPasswords {

    public static void main(String[] args) {
        System.out.println("--------" + EntriesWithDifferentPasswords.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(EntriesWithDifferentPasswords.class);

        // EntriesWithDifferentPasswords
        try (FileOutputStream sevenZipFile = new FileOutputStream(outDir + "archive.7z")) {
            File fi1 = new File(dataDir + "alice29.txt");
            File fi2 = new File(dataDir + "lcet10.txt");
            File fi3 = new File(dataDir + "asyoulik.txt");
            try (SevenZipArchive archive = new SevenZipArchive()) {
                archive.createEntry("alice29.txt", fi1, false, new SevenZipEntrySettings(new SevenZipStoreCompressionSettings(), new SevenZipAESEncryptionSettings("test1")));
                archive.createEntry("lcet10.txt", fi2, false, new SevenZipEntrySettings(new SevenZipStoreCompressionSettings(), new SevenZipAESEncryptionSettings("test2")));
                archive.createEntry("asyoulik.txt", fi3, false, new SevenZipEntrySettings(new SevenZipStoreCompressionSettings(), new SevenZipAESEncryptionSettings("test3")));
                archive.save(sevenZipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Successfully Created a Seven Zip File with AES Encryption Settings");
    }
}