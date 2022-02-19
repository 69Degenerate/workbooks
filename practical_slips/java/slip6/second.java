import java.io.File;
import java.nio.*;
public class second {
    public static void main(String[] args) {
     
      File file = new File("F:");
     
      File[] fileList = file.listFiles((d,f)-> f.toLowerCase().endsWith(".txt"));
      
      for(File f : fileList) {
        System.out.println(f.getAbsolutePath());
      }
    }
  }