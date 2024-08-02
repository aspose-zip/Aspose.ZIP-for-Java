/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.WorkingWithSevenZip;

import com.aspose.zip.SevenZipArchive;
import com.aspose.zip.SevenZipBZip2CompressionSettings;
import com.aspose.zip.SevenZipEntrySettings;
import com.aspose.zip.SevenZipLZMA2CompressionSettings;
import com.aspose.zip.SevenZipStoreCompressionSettings;
import com.aspose.zip.examples.RunExamples;

public class SevenZipWithVariousCompressionMethods {
    public static void main(String[] args) {
        System.out.println("--------" + SevenZipWithVariousCompressionMethods.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        String outDir = RunExamples.getOutDir(SevenZipWithVariousCompressionMethods.class);

        String corpusDir = dataDir + "canterburycorpus/";

        //ExStart: SevenZipWithVariousCompressionMethods

        // LZMA2
        try (SevenZipArchive archive = new SevenZipArchive(new SevenZipEntrySettings(new SevenZipLZMA2CompressionSettings()))) {
            archive.createEntries(corpusDir);
            archive.save(outDir + "SevenZip_lzma2.7z");
        }

        // BZip2
        try (SevenZipArchive archive = new SevenZipArchive(new SevenZipEntrySettings(new SevenZipBZip2CompressionSettings()))) {
            archive.createEntries(corpusDir);
            archive.save(outDir + "SevenZip_bzip2.7z");
        }

        // Store, no compression
        try (SevenZipArchive archive = new SevenZipArchive(new SevenZipEntrySettings(new SevenZipStoreCompressionSettings()))) {
            archive.createEntries(corpusDir);
            archive.save(outDir + "SevenZip_store.7z");
        }

        //ExEnd: SevenZipWithVariousCompressionMethods
        System.out.println("Successfully Created a Seven Zip Files");
    }
}