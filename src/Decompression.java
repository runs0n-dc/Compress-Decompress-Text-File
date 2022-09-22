
import java.io.*;
import java.util.zip.*;

public class Decompression {
public static void decompress(File source,File destination) throws IOException{
    byte []buffer=new byte[1024];
    FileInputStream fis=new FileInputStream(source);
    GZIPInputStream gzis=new GZIPInputStream(fis);
    FileOutputStream fos=new FileOutputStream(destination);
    int read;
    while((read=gzis.read(buffer))!=-1){
        fos.write(buffer,0,read);
    }
    gzis.close();
    fis.close();
    fos.close();
}
    public static void main(String[] args) {
      File source= new File("C:\\Users\\1707d\\Desktop\\output.txt");
      File destination=new File("C:\\Users\\1707d\\Desktop\\afterdecompress.txt");
      try{
        decompress(source,destination);
      }
      catch(IOException e){
        System.out.print(e);
      }  
    }
}
