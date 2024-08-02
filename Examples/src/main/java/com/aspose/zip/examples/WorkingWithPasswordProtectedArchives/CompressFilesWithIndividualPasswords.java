/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.AesEncryptionSettings;
import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.DeflateCompressionSettings;
import com.aspose.zip.EncryptionMethod;
import com.aspose.zip.TraditionalEncryptionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompressFilesWithIndividualPasswords {
    public static void main(String[] args) {
        System.out.println("--------" + CompressFilesWithIndividualPasswords.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressFilesWithIndividualPasswords.class);

        //ExStart: CompressFilesWithIndividualPasswords
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "CompressFilesWithIndividualPasswords_out.zip")) {
            File source1 = new File(dataDir + "alice29.txt");
            File source2 = new File(dataDir + "asyoulik.txt");
            File source3 = new File(dataDir + "fields.c");

            try (Archive archive = new Archive()) {
                archive.createEntry("alice29.txt", source1, true, new ArchiveEntrySettings(new DeflateCompressionSettings(), new TraditionalEncryptionSettings("pass1")));
                archive.createEntry("asyoulik.txt", source2, true, new ArchiveEntrySettings(new DeflateCompressionSettings(), new AesEncryptionSettings("pass2", EncryptionMethod.AES128)));
                archive.createEntry("fields.c", source3, true, new ArchiveEntrySettings(new DeflateCompressionSettings(), new AesEncryptionSettings("pass3", EncryptionMethod.AES256)));
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: CompressFilesWithIndividualPasswords
    }
}