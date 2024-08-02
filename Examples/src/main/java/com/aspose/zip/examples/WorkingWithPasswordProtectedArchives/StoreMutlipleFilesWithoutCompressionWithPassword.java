/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.AesEncryptionSettings;
import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.EncryptionMethod;
import com.aspose.zip.StoreCompressionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoreMutlipleFilesWithoutCompressionWithPassword {
    public static void main(String[] args) {
        System.out.println("--------" + StoreMutlipleFilesWithoutCompressionWithPassword.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(StoreMutlipleFilesWithoutCompressionWithPassword.class);

        //ExStart: StoreMutlipleFilesWithoutCompressionWithPassword
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "StoreMutlipleFilesWithoutCompressionWithPassword_out.zip")) {
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                Archive archive = new Archive(new ArchiveEntrySettings(new StoreCompressionSettings(), new AesEncryptionSettings("p@s$", EncryptionMethod.AES256)));
                archive.createEntry("alice29.txt", source1);
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: StoreMutlipleFilesWithoutCompressionWithPassword
    }
}