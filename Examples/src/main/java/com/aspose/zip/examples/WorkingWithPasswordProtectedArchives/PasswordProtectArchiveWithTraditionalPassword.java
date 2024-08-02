/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.TraditionalEncryptionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PasswordProtectArchiveWithTraditionalPassword {
    public static void main(String[] args) {
        System.out.println("--------" + PasswordProtectArchiveWithTraditionalPassword.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(PasswordProtectArchiveWithTraditionalPassword.class);

        //ExStart: PasswordPrtoectArchiveWithTraditionalPassword
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "CompressWithTraditionalEncryption_out.zip")) {
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                Archive archive = new Archive(new ArchiveEntrySettings(null, new TraditionalEncryptionSettings("p@s$")));
                archive.createEntry("alice29.txt", source1);
                archive.save(zipFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: PasswordPrtoectArchiveWithTraditionalPassword
    }
}