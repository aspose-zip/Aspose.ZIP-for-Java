/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFolders;

import com.aspose.zip.Archive;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.ModifyingZipFile;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompressDirectory {
    public static void main(String[] args) throws IOException {
        System.out.println("--------" + CompressDirectory.class.getSimpleName() + "--------");
        // ExStart: DeCompressDirectory
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressDirectory.class);

        try (FileOutputStream zipFile = new FileOutputStream(new File(outDir + "CompressDirectory_out.zip")); FileOutputStream zipFile2 = new FileOutputStream(new File(outDir + "CompressDirectory2_out.zip"))) {

            Archive archive = new Archive();
            File corpus = new File(dataDir + "CanterburyCorpus");
            archive.createEntries(corpus);
            archive.save(zipFile);
            archive.save(zipFile2);
        }
        // ExEnd: DeCompressDirectory
    }
}