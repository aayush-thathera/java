import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class FileIO {
        public static void main(String[] args) {
            try {
                File file = new File("test.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line ;
                while ((line = br.readLine())!=null) {
                    System.out.println(line);
                }
                br.close();
            } catch (Exception e) {
                System.out.println(e);    
            }
        }    
}