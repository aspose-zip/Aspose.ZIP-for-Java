/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveLoadOptions;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecompressAESEncryptedStoredFile {

    public static void main(String[] args) throws IOException {
        System.out.println("--------" + DecompressAESEncryptedStoredFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressAESEncryptedStoredFile.class);

        System.out.println("-->-");
        StoreMutlipleFilesWithoutCompressionWithPassword.main(args);
        System.out.println("-<--");

        //ExStart: DecompressAESEncryptedStoredFile
        try (FileInputStream fs = new FileInputStream(RunExamples.getOutDir(StoreMutlipleFilesWithoutCompressionWithPassword.class) + "StoreMutlipleFilesWithoutCompressionWithPassword_out.zip")) {
            try (FileOutputStream extracted = new FileOutputStream(outDir + "alice_aesextracted_out.txt")) {
                ArchiveLoadOptions options = new ArchiveLoadOptions();
                options.setDecryptionPassword("p@s$");
                try (Archive archive = new Archive(fs, options)) {
                    try (InputStream decompressed = archive.getEntries().get(0).open()) {
                        byte[] buffer = new byte[8192];
                        int bytesRead;
                        while ((bytesRead = decompressed.read(buffer)) > 0) {
                            extracted.write(buffer, 0, bytesRead);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressAESEncryptedStoredFile
    }
}