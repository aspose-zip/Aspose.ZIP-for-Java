/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntry;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;

public class DecompressSingleFile {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressSingleFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressSingleFile.class);

        System.out.println("-->-");
        CompressSingleFile.main(args);       // Create a compressed file to work with
        System.out.println("-<--");

        // ExStart: DecompressSingleFile
        try (FileInputStream fis = new FileInputStream(RunExamples.getOutDir(CompressSingleFile.class) + "CompressSingleFile_out.zip")) {
            Archive archive = new Archive(fis);
            int[] percentReady = {0};
            archive.getEntries().get(0).setExtractionProgressed((s, e) -> {
                int percent = (int) ((100 * e.getProceededBytes()) / ((ArchiveEntry) s).getUncompressedSize());
                if (percent > percentReady[0]) {
                    System.out.println(String.format("%d%% decompressed", percent));
                    percentReady[0] = percent;
                }
            });
            archive.getEntries().get(0).extract(outDir + "alice_extracted_out.txt");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // ExEnd: DecompressSingleFile
    }
}