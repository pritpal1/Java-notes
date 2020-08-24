import java.io.File;
import java.io.FileReader;

public class FilenotFound {

   public static void main(String args[]) {		
      File file = new File("");
      FileReader fr = new FileReader(file); 
   }
}