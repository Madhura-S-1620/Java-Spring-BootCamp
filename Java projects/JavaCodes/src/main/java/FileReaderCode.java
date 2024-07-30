import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderCode {
    public void readFile(String filePath) {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileReaderCode fileReaderCode = new FileReaderCode();
      
        fileReaderCode.readFile("F:\\Coforge Java Bootcamp\\Java projects\\JavaCodes\\src\\main\\java\\Hello.java");
        
    }
}
