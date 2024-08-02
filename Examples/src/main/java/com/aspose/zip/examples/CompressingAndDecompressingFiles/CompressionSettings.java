/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples.CompressingAndDecompressingFiles;

import com.aspose.zip.Archive;
import com.aspose.zip.ArchiveEntrySettings;
import com.aspose.zip.Bzip2CompressionSettings;
import com.aspose.zip.EnhancedDeflateCompressionSettings;
import com.aspose.zip.LzmaCompressionSettings;
import com.aspose.zip.PPMdCompressionSettings;
import com.aspose.zip.StoreCompressionSettings;
import com.aspose.zip.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class CompressionSettings {

    public static void main(String[] args) {
        System.out.println("--------" + CompressionSettings.class.getSimpleName() + "--------");
        String dataDir = RunExamples.getDataDir();
        UsingBzip2CompressionSettings(dataDir);
        UsingLZMACompressionSettings(dataDir);
        UsingPPMdCompressionSettings(dataDir);
        UsingEnhancedDeflateCompressionSettings(dataDir);
        UsingStoreCompressionSettings(dataDir);
    }

    public static void UsingBzip2CompressionSettings(String dataDir) {
        String outDir = RunExamples.getOutDir(CompressionSettings.class);
        //ExStart: UsingBzip2CompressionSettings
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "Bzip2Compression_out.zip")) {
            try (Archive archive = new Archive(new ArchiveEntrySettings(new Bzip2CompressionSettings()))) {
                archive.createEntry("sample.txt", dataDir + "sample.txt");
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: UsingBzip2CompressionSettings
    }

    public static void UsingLZMACompressionSettings(String dataDir) {
        String outDir = RunExamples.getOutDir(CompressionSettings.class);
        //ExStart: UsingLZMACompressionSettings
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "LZMACompression_out.zip")) {
            try (Archive archive = new Archive(new ArchiveEntrySettings(new LzmaCompressionSettings()))) {
                archive.createEntry("sample.txt", dataDir + "sample.txt");
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: UsingLZMACompressionSettings
    }

    public static void UsingPPMdCompressionSettings(String dataDir) {
        String outDir = RunExamples.getOutDir(CompressionSettings.class);
        //ExStart: UsingPPMdCompressionSettings
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "PPMdCompression_out.zip")) {
            try (Archive archive = new Archive(new ArchiveEntrySettings(new PPMdCompressionSettings()))) {
                archive.createEntry("sample.txt", dataDir + "sample.txt");
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: UsingPPMdCompressionSettings
    }

    public static void UsingEnhancedDeflateCompressionSettings(String dataDir) {
        String outDir = RunExamples.getOutDir(CompressionSettings.class);
        //ExStart: UsingEnhancedDeflateCompressionSettings
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "EnhancedDeflateCompression_out.zip")) {
            try (Archive archive = new Archive(new ArchiveEntrySettings(new EnhancedDeflateCompressionSettings()))) {
                archive.createEntry("sample.txt", dataDir + "sample.txt");
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: UsingEnhancedDeflateCompressionSettings
    }

    public static void UsingStoreCompressionSettings(String dataDir) {
        String outDir = RunExamples.getOutDir(CompressionSettings.class);
        //ExStart: UsingStoreCompressionSettings
        try (FileOutputStream zipFile = new FileOutputStream(outDir + "StoreCompression_out.zip")) {
            try (Archive archive = new Archive(new ArchiveEntrySettings(new StoreCompressionSettings()))) {
                archive.createEntry("sample.txt", dataDir + "sample.txt");
                archive.save(zipFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //ExEnd: UsingStoreCompressionSettings
    }
}