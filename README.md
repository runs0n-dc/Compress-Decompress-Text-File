GZIP Algorithm:
The GZIP stands for the GNU Zip algorithm and is used to compress the files into a gzip file format. This file format must not be confused with the ZIP archive file format as the gzip works on a single file. The GZIP is based on the Deflate algorithm.

CGZip Encoder
In this class, we have imported the java.io package for using the file operations and util.zip.GZIPOutputStream class . This class implements a stream filter for writing compressed data in the GZIP file format. We also define a loadFile() method overloaded with different number of parameters. The boolean encodeFile() method returns true on the successful encoding of the file.

CGZip Decoder
In this class, we have imported the java.io package for using the file operations and util.zip.GZIPInputStream class . This class implements a stream filter for reading compressed data in the GZIP file format. We also define a loadFile() method overloaded with different number of parameters. The boolean decodeFile() method returns true on the successful decoding of the file.
