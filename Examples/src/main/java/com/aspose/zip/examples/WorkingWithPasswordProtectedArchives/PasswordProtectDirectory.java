/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.TraditionalEncryptionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PasswordProtectDirectory {
    public static void main(String[] args) {
        System.out.println("--------" + PasswordProtectDirectory.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(PasswordProtectDirectory.class);

        //ExStart: PasswordProtectDirectory
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "./all_corpus_encrypted_out.zip")) {
            File corpus = new File(dataDir + "./CanterburyCorpus");
            try (Archive archive = new Archive(new ArchiveEntrySettings(null, new TraditionalEncryptionSettings("p@s$")))) {
                archive.createEntries(corpus);
                archive.save(zipFile);
                //ExEnd: PasswordProtectDirectory
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}