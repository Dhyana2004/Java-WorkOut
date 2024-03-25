import java.io.File;
// to work on files import this before using it
// i created a file called File Method.txt
public class FileClassExample {
    public static void main(String[] args) {
      File file=new File("File Method.txt"); // this is by file name
       // File file=new File("C:/Users/K Dhyana Samaga/Desktop/java bro code/File Method.txt"); //this is by file path
        // File file=new File("C:\\Users\\K Dhyana Samaga\\Desktop\\java bro code");  //this is for windows
        //  file.exists() used to check if the file is present or not in this folder
        // if the file is not there locate the file and past the file path in it

        if(file.exists()){
            System.out.println("the file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());//return hole path of the file
            System.out.println(file.isFile());  //returns True or False if it is file return true or it returns false
            System.out.println(file.delete()); //delets the file from the folder   if the file did not delete just refresh ur IDE
        }
        else{
            System.out.println("file does not exist");
        }
    }
    
}
