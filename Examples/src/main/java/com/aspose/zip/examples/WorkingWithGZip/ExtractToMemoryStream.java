/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithGZip;

import com.aspose.zip.GzipArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExtractToMemoryStream {
    public static void main(String[] args) {
        System.out.println("--------" + ExtractToMemoryStream.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(ExtractToMemoryStream.class);

        // Open an archive from a stream and extract it to a ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream = new FileInputStream(dataDir + "sample.gz")) {
            try (GzipArchive archive = new GzipArchive(fileInputStream)) {
                RunExamples.copyTo(archive.open(), outputStream);
                System.out.println(archive.getName());
            }
            System.out.println("Successfully Extracted to Memory Stream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}