/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.Archive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecompressAESEncryptedFile {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressAESEncryptedFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressAESEncryptedFile.class);

        System.out.println("-->-");
        PasswordProtectWithAES.main(args);    // run password protection a file example to use it later
        System.out.println("-<--");

        //ExStart: DecompressAESEncryptedFile
        try (FileInputStream fis = new FileInputStream(RunExamples.getOutDir(PasswordProtectWithAES.class) + "PasswordProtectWithAES256_out.zip"); FileOutputStream extracted = new FileOutputStream(outDir + "alice_aesextracted_out.txt"); Archive archive = new Archive(fis); InputStream decompressed = archive.getEntries().get(0).open("p@s$")) {

            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = decompressed.read(buffer)) != -1) {
                extracted.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressAESEncryptedFile
    }
}