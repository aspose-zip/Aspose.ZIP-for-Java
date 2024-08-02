/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.TraditionalEncryptionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompressMultipleFilesWithTraditionalEncryption {
    public static void main(String[] args) {
        System.out.println("--------" + CompressMultipleFilesWithTraditionalEncryption.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressMultipleFilesWithTraditionalEncryption.class);

        // ExStart: CompressMultipleFilesWithTraditionalEncryption
        try (FileOutputStream zipFile = new FileOutputStream(outDir + ".\\CompressMultipleFilesWithTraditionalEncryption_out.zip")) {
            File source1 = new File(dataDir + ".\\CanterburyCorpus\\alice29.txt");
            File source2 = new File(dataDir + ".\\CanterburyCorpus\\asyoulik.txt");
            File source3 = new File(dataDir + ".\\CanterburyCorpus\\fields.c");

            try (Archive archive = new Archive(new ArchiveEntrySettings(null, new TraditionalEncryptionSettings("p@s$")))) {
                archive.createEntry("alice29.txt", new FileInputStream(source1));
                archive.createEntry("asyoulik.txt", new FileInputStream(source2));
                archive.createEntry("fields.c", new FileInputStream(source3));
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: CompressMultipleFilesWithTraditionalEncryption
    }
}