/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithXzArchives;

import com.aspose.zip.XzArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecompressXzFile {
    public static void main(String[] args) {
        System.out.println("--------" + DecompressXzFile.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(DecompressXzFile.class);

        // Extracts the archive and copies extracted content to file stream.
        try (XzArchive archive = new XzArchive(dataDir + "archive.xz")) {
            try (FileOutputStream extracted = new FileOutputStream(new File(outDir + "alice29_out.txt"))) {
                archive.extract(extracted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Successfully Opened xz Archive");
    }
}