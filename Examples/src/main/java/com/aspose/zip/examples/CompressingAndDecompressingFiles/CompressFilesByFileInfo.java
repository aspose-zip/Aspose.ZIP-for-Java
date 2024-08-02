/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveSaveOptions;
import com.aspose.zip.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CompressFilesByFileInfo {

    public static void main(String[] args) {
        System.out.println("--------" + CompressFilesByFileInfo.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(CompressFilesByFileInfo.class);

        //ExStart: CompressFilesByFileInfo
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "CompressFilesByFileInfo_out.zip")) {
            File fi1 = new File(dataDir + "alice29.txt");
            File fi2 = new File(dataDir + "fields.c");

            try (Archive archive = new Archive()) {
                archive.createEntry("alice29.txt", fi1);
                archive.createEntry("fields.c", fi2);
                archive.save(zipFile, new ArchiveSaveOptions());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: CompressFilesByFileInfo
    }
}