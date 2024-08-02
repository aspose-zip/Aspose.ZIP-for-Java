/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFolders;

import com.aspose.zip.Archive;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class DecompressFolder {
    public static void main(String[] args) throws IOException {
        System.out.println("--------" + DecompressFolder.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressFolder.class);

        System.out.println("-->-");
        CompressDirectory.main(args);    // Create a zip file from Directory to be decompressed later in this example
        System.out.println("-<--");

        // ExStart: DecompressFolder
        try (FileInputStream zipFile = new FileInputStream(RunExamples.getOutDir(CompressDirectory.class) + "CompressDirectory_out.zip")) {
            try (Archive archive = new Archive(zipFile)) {
                archive.extractToDirectory(outDir + "DecompressFolder_out");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: DecompressFolder
    }
}