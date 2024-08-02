/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithSevenZip;

import com.aspose.zip.SevenZipAESEncryptionSettings;
import com.aspose.zip.SevenZipArchive;
import com.aspose.zip.SevenZipEntrySettings;
import com.aspose.zip.examples.RunExamples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class AESEncryptionSettings {
    public static void main(String[] args) {
        System.out.println("--------" + AESEncryptionSettings.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(AESEncryptionSettings.class);

        //ExStart: AESEncryptionSettings
        try (SevenZipArchive archive = new SevenZipArchive(new SevenZipEntrySettings(null, new SevenZipAESEncryptionSettings("p@s$")))) {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            outputStream.write(new byte[] {0x00, (byte) 0xFF});
            InputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            archive.createEntry("data.bin", inputStream);
            archive.save(outDir + "archive.7z");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: AESEncryptionSettings
        System.out.println("Successfully Created a Seven Zip File with AES Encryption Settings");
    }
}