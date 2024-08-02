/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithSevenZip;

import com.aspose.zip.SevenZipArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateSevenZipEntry {

    public static void main(String[] args) {
        System.out.println("--------" + CreateSevenZipEntry.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CreateSevenZipEntry.class);

        //ExStart: CreateSevenZipEntry
        try (FileOutputStream sevenZipFile = new FileOutputStream(outDir + "archive.7z")) {
            SevenZipArchive archive = new SevenZipArchive();
            archive.createEntry("data.bin", dataDir + "sample.txt");
            archive.save(sevenZipFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: CreateSevenZipEntry
        System.out.println("Successfully Created a Seven Zip File with AES Encryption Settings");
    }
}