import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("FileMethod.txt"); 
            writer.write("K DHYANA SAMAGA");
            writer.append("(just a function)");// this insert the element to the file to the last
            writer.close();
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
