/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithSevenZip;

import com.aspose.zip.SevenZipAESEncryptionSettings;
import com.aspose.zip.SevenZipArchive;
import com.aspose.zip.SevenZipEntrySettings;
import com.aspose.zip.SevenZipLZMACompressionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchiveWithEncryptedEntry {
    public static void main(String[] args) {
        System.out.println("--------" + ArchiveWithEncryptedEntry.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(ArchiveWithEncryptedEntry.class);

        //ExStart: ArchiveWithEncryptedEntry
        try (FileOutputStream sevenZipFile = new FileOutputStream(outDir + "archive.7z")) {
            SevenZipArchive archive = new SevenZipArchive();
            archive.createEntry("entry1.bin", new ByteArrayInputStream(new byte[] {
                    0x00, (byte) 0xFF
            }), new SevenZipEntrySettings(new SevenZipLZMACompressionSettings(), new SevenZipAESEncryptionSettings("test1")));
            archive.save(sevenZipFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: ArchiveWithEncryptedEntry
        System.out.println("Successfully Created a Seven Zip File with AES Encryption Settings");
    }
}