/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithGZip;

import com.aspose.zip.GzipArchive;
import com.aspose.zip.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.io.File;

public class SaveToStream {
    public static void main(String[] args) {
        System.out.println("--------" + SaveToStream.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(SaveToStream.class);

        // ExStart: SaveToStream
        // Writes compressed data to http response stream.
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        try (GzipArchive archive = new GzipArchive()) {
            archive.setSource(new File(dataDir + "data.bin"));
            archive.save(bs);
        }
        // ExEnd: SaveToStream

        System.out.println("Successfully Saved to Stream");
    }
}