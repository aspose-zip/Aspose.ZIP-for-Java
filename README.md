![GitHub](https://img.shields.io/github/license/aspose-zip/Aspose.ZIP-for-Java)

# Java API for Files Compression & Archiving

[Aspose.ZIP for Java](https://products.aspose.com/zip/java) class library allows your Java applications to compress/decompress files and folders without getting into the complexity of coding new compression algorithms or understanding the existing ones. Enable your programs to work with a vast range of features, such as, creating archives, saving archives, archive extraction, encrypting/decrypting archives, compressing single or multiple files as well as directory contents. It also allows you to apply security to your archived and compressed files and folders via password using ZipCrypto or AES (128, 192, 256) encryption or mixed encryption.

<p align="center">
<a title="Download complete Aspose.ZIP for Java source code" href="https://github.com/aspose-zip/Aspose.Zip-for-Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

Directory | Description
--------- | -----------
[Examples](Examples)  | A collection of Java examples that help you learn the product features.

# Compress & Extract Files via Java

- [Compress files and folders]((https://docs.aspose.com/zip/java/compressing-and-decompressing-files/)) into standard ZIP format using Deflate, Bzip2, LZMA or PPMd compression algorithm.
- Extract RAR4 and RAR5 archives, with and without encryption.
- [Apply simple password or `AES128`, `AES192`, `AES256` encryption to archives](https://docs.aspose.com/zip/java/password-protecting-archives/).
- Employ different protection scheme to each file within an archive.
- Append more files to an existing zipped archive.
- Use `Gzip`, `Bzip2`, `Xz`, `Z` and `Lzip` to pack files & folders into a `TAR` or `Cpio` archive.
- Supports `LZMA`, `LZMA2` or `Bzip2`  compression & optional encryption to create `7z` archives.
- [Track progress of compression](https://docs.aspose.com/zip/java/reporting-compression-progress/).
- Create self-extracting compressed archives.

## Compress Files As

**Compression:** Zip, Tar, Cpio, GZip, Bz2, Z, Xz, Lzip, 7z

## Read Archives

**Decompression:** Zip, Rar, Cab, Tar, Cpio, GZip, Bz2, Z, Xz, Lzip

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 8.0 (1.8)` or above

## Get Started with Aspose.ZIP for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://releases.aspose.com/java/repo/com/aspose/aspose-zip/). You can easily use Aspose.ZIP for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.ZIP for Java from Maven Repository](https://docs.aspose.com/zip/java/installation/) documentation page.

## How to ZIP files in Java

```java
try (Archive archive = new Archive()) {
   archive.createEntry("entry_name.dat", "input_file.dat");
   archive.save("result_archive.zip");
}
```

## How to UnZIP files in Java

```java
try (Archive archive = new Archive("input_archive.zip")) {
   archive.extractToDirectory("outputDirectory");
}
```

## How to create 7z Archive with AES Encryption

```java
try (SevenZipArchive archive = new SevenZipArchive(
        new SevenZipEntrySettings(null, new SevenZipAESEncryptionSettings("p@s$")))) {
    archive.createEntry("data.bin", new ByteArrayInputStream(new byte[] { 0x00, (byte)0xFF }));
    archive.save("result_archive.7z");
}
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/zip/java) | [Docs](https://docs.aspose.com/zip/java/) | [API Reference](https://reference.aspose.com/zip/java) | [Examples](https://github.com/aspose-zip/Aspose.ZIP-for-Java) | [Blog](https://blog.aspose.com/category/zip/) | [Search](https://search.aspose.com/) | [Free Support](https://forum.aspose.com/c/zip) | [Temporary License](https://purchase.aspose.com/temporary-license)
