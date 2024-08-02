/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithPasswordProtectedArchives;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveLoadOptions;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;

public class DecompressCompressedFolderToDirectory {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressCompressedFolderToDirectory.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressCompressedFolderToDirectory.class);

        System.out.println("-->-");
        PasswordProtectDirectory.main(args);    // run password protection a file example to use it later
        System.out.println("-<--");

        //ExStart: DecompressCompressedFolderToDirectory
        try (FileInputStream zipFile = new FileInputStream(RunExamples.getOutDir(PasswordProtectDirectory.class) + ".\\all_corpus_encrypted_out.zip")) {
            new Archive(zipFile, new ArchiveLoadOptions() {{
                setDecryptionPassword("p@s$");
            }}).extractToDirectory(outDir + ".\\all_corpus_decrypted");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //ExEnd: DecompressCompressedFolderToDirectory
    }
}