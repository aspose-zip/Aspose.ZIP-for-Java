/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntry;
import com.aspose.zip.ArchiveLoadOptions;
import com.aspose.zip.examples.RunExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecompressMultipleFiles {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressMultipleFiles.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressMultipleFiles.class);

        System.out.println("-->-");
        CompressMultipleFiles.main(args); // Create a compressed file with multiple files
        System.out.println("-<--");

        // ExStart: DecompressMultipleFiles
        try (FileInputStream zipFile = new FileInputStream(RunExamples.getOutDir(CompressMultipleFiles.class) + "CompressMultipleFiles_out.zip")) {
            StringBuilder sb = new StringBuilder("Entries are: ");
            final int[] percentReady = {0};
            ArchiveLoadOptions options = new ArchiveLoadOptions();
            options.setEntryListed((sender, entryEventArgs) -> sb.append(entryEventArgs.getEntry().getName() + ", "));
            options.setEntryExtractionProgressed((sender, progressEventArgs) -> {
                int percent = (int) ((100 * progressEventArgs.getProceededBytes()) / ((ArchiveEntry) sender).getUncompressedSize());
                if (percent > percentReady[0]) {
                    System.out.println(percent + "% compressed");
                    percentReady[0] = percent;
                }
            });
            try (Archive archive = new Archive(zipFile, options)) {
                System.out.println(sb.substring(0, sb.length() - 2));
                try (FileOutputStream extracted = new FileOutputStream(outDir + "alice_extracted_out.txt"); InputStream decompressed = archive.getEntries().get(0).open()) {
                    byte[] buffer = new byte[8192];
                    int bytesRead;
                    while ((bytesRead = decompressed.read(buffer, 0, buffer.length)) != -1) {
                        extracted.write(buffer, 0, bytesRead);
                    }
                }
                percentReady[0] = 0;
                archive.getEntries().get(1).extract(outDir + "asyoulik_extracted_out.txt");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ExEnd: DecompressMultipleFiles
    }
}