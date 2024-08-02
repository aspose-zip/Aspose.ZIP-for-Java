/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveSaveOptions;
import com.aspose.zip.ParallelCompressionMode;
import com.aspose.zip.ParallelOptions;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UsingParallelismToCompressFiles {
    public static void main(String[] args) throws IOException {
        System.out.println("--------" + UsingParallelismToCompressFiles.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(UsingParallelismToCompressFiles.class);

        //ExStart: UsingParallelismToCompressFiles
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "UsingParallelismToCompressFiles_out.zip")) {
            try (FileInputStream source1 = new FileInputStream(dataDir + "alice29.txt")) {
                try (FileInputStream source2 = new FileInputStream(dataDir + "asyoulik.txt")) {
                    try (Archive archive = new Archive()) {
                        archive.createEntry("alice29.txt", source1);
                        archive.createEntry("asyoulik.txt", source2);
                        // Define the parallelism criterion
                        ParallelOptions parallelOptions = new ParallelOptions();
                        parallelOptions.setParallelCompressInMemory(ParallelCompressionMode.Always);
                        ArchiveSaveOptions options = new ArchiveSaveOptions();
                        options.setParallelOptions(parallelOptions);
                        options.setEncoding(StandardCharsets.US_ASCII);
                        options.setArchiveComment("There are two poems from Canterbury corpus");
                        archive.save(zipFile, options);
                    }
                }
            }
        }
        //ExEnd: UsingParallelismToCompressFiles
    }
}