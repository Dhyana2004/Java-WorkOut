import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; // Import IOException for handling read() method

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("ReadFile.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // File not found, handle the exception here
            e.printStackTrace();
        } catch (IOException e) {
            // Error while reading the file, handle the exception here
            e.printStackTrace();
        }
    }
}
