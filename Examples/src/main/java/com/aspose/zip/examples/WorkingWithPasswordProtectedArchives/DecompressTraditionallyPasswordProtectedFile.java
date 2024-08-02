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

public class DecompressTraditionallyPasswordProtectedFile {

    public static void main(String[] args) {
        System.out.println("--------" + DecompressTraditionallyPasswordProtectedFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressTraditionallyPasswordProtectedFile.class);

        System.out.println("-->-");
        PasswordProtectArchiveWithTraditionalPassword.main(args);    // run password protection a file example to use it later
        System.out.println("-<--");

        // ExStart: DecompressTraditionallyPasswordProtectedFile
        try (FileInputStream fs = new FileInputStream(RunExamples.getOutDir(PasswordProtectArchiveWithTraditionalPassword.class) + "CompressWithTraditionalEncryption_out.zip")) {
            try (FileOutputStream extracted = new FileOutputStream(outDir + "alice_extracted_out.txt")) {
                try (Archive archive = new Archive(fs, new ArchiveLoadOptions() {{
                    setDecryptionPassword("p@s$");
                }})) {
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
        // ExEnd: DecompressTraditionallyPasswordProtectedFile
    }
}