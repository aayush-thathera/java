import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aab {
    public static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e);}
        }

}
