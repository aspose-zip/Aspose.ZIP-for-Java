/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.AesEncryptionSettings;
import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.EncryptionMethod;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PasswordProtectWithAES {
    public static void main(String[] args) {
        System.out.println("--------" + PasswordProtectWithAES.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(PasswordProtectWithAES.class);

        // ExStart: PasswordProtectWithAES128
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "PasswordProtectWithAES128_out.zip")) {
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                try (Archive archive = new Archive(new ArchiveEntrySettings(null, new AesEncryptionSettings("p@s$", EncryptionMethod.AES128)))) {
                    archive.createEntry("alice29.txt", source1);
                    archive.save(zipFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: PasswordProtectWithAES128

        // ExStart: PasswordProtectWithAES192
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "PasswordProtectWithAES192_out.zip")) {
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                try (Archive archive = new Archive(new ArchiveEntrySettings(null, new AesEncryptionSettings("p@s$", EncryptionMethod.AES192)))) {
                    archive.createEntry("alice29.txt", source1);
                    archive.save(zipFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: PasswordProtectWithAES192

        // ExStart: PasswordProtectWithAES256
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "PasswordProtectWithAES256_out.zip")) {
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                try (Archive archive = new Archive(new ArchiveEntrySettings(null, new AesEncryptionSettings("p@s$", EncryptionMethod.AES256)))) {
                    archive.createEntry("alice29.txt", source1);
                    archive.save(zipFile);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: PasswordProtectWithAES256
    }
}