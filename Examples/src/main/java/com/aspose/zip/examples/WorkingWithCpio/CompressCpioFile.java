/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithCpio;

import com.aspose.zip.CpioArchive;
import com.aspose.zip.examples.RunExamples;

public class CompressCpioFile {
    public static void main(String[] args) {
        System.out.println("--------" + CompressCpioFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressCpioFile.class);

        //ExStart: CompressFile
        try (CpioArchive archive = new CpioArchive()) {
            archive.createEntries(dataDir);
            archive.save(outDir + "archive.cpio");
        }
        //ExEnd: CompressFile
        System.out.println("Successfully Compressed Files");
    }
}