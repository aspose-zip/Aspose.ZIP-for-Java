/*
 * Copyright (c) 2001-2024 Aspose Pty Ltd. All rights reserved.
 */

package com.aspose.zip.examples;

import com.aspose.zip.examples.CompressToTarXX.CompressToTarBz2;
import com.aspose.zip.examples.CompressToTarXX.CompressToTarGz;
import com.aspose.zip.examples.CompressToTarXX.CompressToTarLz;
import com.aspose.zip.examples.CompressToTarXX.CompressToTarXz;
import com.aspose.zip.examples.CompressToTarXX.CompressToTarZ;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.CompressFilesByFileInfo;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.CompressMultipleFiles;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.CompressSingleFile;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.CompressionSettings;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.DecompressMultipleFiles;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.DecompressSingleFile;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.DecompressStoredFile;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.ModifyingZipFile;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.StoreMultipleFilesWithoutCompression;
import com.aspose.zip.examples.CompressingAndDecompressingFiles.UsingParallelismToCompressFiles;
import com.aspose.zip.examples.CompressingAndDecompressingFolders.CompressDirectory;
import com.aspose.zip.examples.CompressingAndDecompressingFolders.DecompressFolder;
import com.aspose.zip.examples.CompressingAndDecompressingFolders.ExtractArchiveWithEntriesHavingDifferentPasswords;
import com.aspose.zip.examples.RarExtraction.DecompressRarArchive;
import com.aspose.zip.examples.RarExtraction.DecompressRarEntry;
import com.aspose.zip.examples.RarExtraction.DecryptRarArchive;
import com.aspose.zip.examples.WorkWithLzma.CompressToLzma;
import com.aspose.zip.examples.WorkWithLzma.DecompressFromLzma;
import com.aspose.zip.examples.WorkingWithCab.DecompressCabToFolder;
import com.aspose.zip.examples.WorkingWithCpio.CompressCpioFile;
import com.aspose.zip.examples.WorkingWithGZip.CompressFile;
import com.aspose.zip.examples.WorkingWithGZip.ExtractToMemoryStream;
import com.aspose.zip.examples.WorkingWithGZip.OpenGZipArchive;
import com.aspose.zip.examples.WorkingWithGZip.SaveToStream;
import com.aspose.zip.examples.WorkingWithLzArchives.CompressLzFile;
import com.aspose.zip.examples.WorkingWithLzArchives.DecompressLzFile;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.CompressFilesWithIndividualPasswords;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.CompressMultipleFilesWithTraditionalEncryption;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.DecompressAESEncryptedFile;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.DecompressAESEncryptedStoredFile;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.DecompressCompressedFolderToDirectory;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.DecompressTraditionallyPasswordProtectedFile;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.PasswordProtectArchiveWithTraditionalPassword;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.PasswordProtectDirectory;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.PasswordProtectWithAES;
import com.aspose.zip.examples.WorkingWithPasswordProtectedArchives.StoreMutlipleFilesWithoutCompressionWithPassword;
import com.aspose.zip.examples.WorkingWithSevenZip.AESEncryptionSettings;
import com.aspose.zip.examples.WorkingWithSevenZip.ArchiveWithEncryptedEntry;
import com.aspose.zip.examples.WorkingWithSevenZip.CreateSevenZipEntries;
import com.aspose.zip.examples.WorkingWithSevenZip.CreateSevenZipEntry;
import com.aspose.zip.examples.WorkingWithSevenZip.EntriesWithDifferentPasswords;
import com.aspose.zip.examples.WorkingWithSevenZip.SevenZipWithVariousCompressionMethods;
import com.aspose.zip.examples.WorkingWithWim.DecompressWimToFolder;
import com.aspose.zip.examples.WorkingWithXar.DecompressXarToFolder;
import com.aspose.zip.examples.WorkingWithXzArchives.CompressXzFile;
import com.aspose.zip.examples.WorkingWithXzArchives.DecompressXzFile;
import com.aspose.zip.examples.WorkingWithZArchives.CompressZFile;
import com.aspose.zip.examples.WorkingWithZArchives.DecompressZFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

public class RunExamples {

    private static String dataDir;

    public static void main(String[] args) throws IOException {
        clean();

        //License Settings
        //try {
        //    License lic = new License();
        //    lic.setLicense("Aspose.ZIP.Java.lic");
        //} catch (Exception ex) {
        //    System.out.println("Failed to set license");
        //}

        // Compressing and Decompressing Files
        System.out.println("## Compressing and Decompressing Files ##");
        CompressSingleFile.main(args);
        CompressMultipleFiles.main(args);
        CompressFilesByFileInfo.main(args);
        StoreMultipleFilesWithoutCompression.main(args);
        DecompressSingleFile.main(args);
        DecompressMultipleFiles.main(args);
        DecompressStoredFile.main(args);
        UsingParallelismToCompressFiles.main(args);
        CompressionSettings.main(args);
        ModifyingZipFile.main(args);

        // Compressing and Decompressing Folders
        System.out.println("## Compressing and Decompressing Folders ##");
        CompressDirectory.main(args);
        DecompressFolder.main(args);
        ExtractArchiveWithEntriesHavingDifferentPasswords.main(args);

        // Working with Password Protection of Archives
        System.out.println("## Working with Password Protection of Archives ##");
        PasswordProtectArchiveWithTraditionalPassword.main(args);
        DecompressTraditionallyPasswordProtectedFile.main(args);
        PasswordProtectWithAES.main(args);
        DecompressAESEncryptedFile.main(args);
        StoreMutlipleFilesWithoutCompressionWithPassword.main(args);
        DecompressAESEncryptedStoredFile.main(args);
        CompressFilesWithIndividualPasswords.main(args);
        CompressMultipleFilesWithTraditionalEncryption.main(args);
        DecompressCompressedFolderToDirectory.main(args);
        PasswordProtectDirectory.main(args);

        // Work with GZip
        System.out.println("## Work with GZip ##");
        OpenGZipArchive.main(args);
        ExtractToMemoryStream.main(args);
        CompressFile.main(args);
        SaveToStream.main(args);

        // Rar extraction
        System.out.println("## Rar extraction ##");
        DecompressRarEntry.main(args);
        DecompressRarArchive.main(args);
        DecryptRarArchive.main(args);

        // Work with Cab
        System.out.println("## Work with Cab ##");
        DecompressCabToFolder.main(args);

        // Work with Z archives
        System.out.println("## Work with Z archives ##");
        CompressZFile.main(args);
        DecompressZFile.main(args);

        // Work with Xz archives
        System.out.println("## Work with Xz archives ##");
        CompressXzFile.main(args);
        DecompressXzFile.main(args);

        // Work With Lz archives
        System.out.println("## Work With Lz archives ##");
        CompressLzFile.main(args);
        DecompressLzFile.main(args);

        // Work with Cpio
        System.out.println("## Work with Cpio ##");
        CompressCpioFile.main(args);

        // Compress to tar.xx
        System.out.println("## Compress to tar.xx ##");
        CompressToTarBz2.main(args);
        CompressToTarGz.main(args);
        CompressToTarLz.main(args);
        CompressToTarXz.main(args);
        CompressToTarZ.main(args);

        // Work with Lzma archves
        System.out.println("## Work with Lzma archves ##");
        CompressToLzma.main(args);
        DecompressFromLzma.main(args);

        // Work with SevenZip archves
        System.out.println("## Work with SevenZip archves ##");
        AESEncryptionSettings.main(args);
        ArchiveWithEncryptedEntry.main(args);
        CreateSevenZipEntries.main(args);
        CreateSevenZipEntry.main(args);
        EntriesWithDifferentPasswords.main(args);
        SevenZipWithVariousCompressionMethods.main(args);

        // Work with Wim archves
        System.out.println("## Work with Wim archves ##");
        DecompressWimToFolder.main(args);

        // Work with Xar archves
        System.out.println("## Work with Xar archves ##");
        DecompressXarToFolder.main(args);

        System.out.println("Done with executing selected example (s)");
        //System.in.read();
    }

    private static void clean() {
        File outDir = new File(getDataDir() + "/out/");
        if (outDir.exists()) {
            deleteFolder(outDir);
        }
    }

    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }

    public static String getDataDir() {
        if (dataDir != null) {
            return dataDir;
        }

        File dir = new File(System.getProperty("user.dir"));

        // User can open root project or Example subproject
        if (!dir.toPath().endsWith("Examples")) {
            dir = new File(dir, "Examples");
        }

        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        for (String s : RunExamples.class.getName().split("\\.")) {
            File _dir = new File(dir, s);
            if (_dir.isDirectory() == false) {
                break;//dir.mkdir();
            }
            dir = _dir;
        }

        System.out.println("Using data directory: " + dir.toString());
        dataDir = dir.toString() + File.separator;
        return dataDir;
    }

    public static String getOutDir(Class cl) {
        String dataDir = getDataDir();

        String[] cla = cl.getName().split("\\.");
        String className = cla[cla.length - 1];
        File outDir = new File(dataDir, "out");
        outDir = new File(outDir, className);
        if (!outDir.exists()) {
            try {
                Files.createDirectories(outDir.toPath());
                //outDir.mkdir();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return outDir.toString() + File.separator;
    }

    public static void copyTo(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[16384];
        int len;
        while ((len = input.read(buffer)) != -1) {
            output.write(buffer, 0, len);
        }
    }
}