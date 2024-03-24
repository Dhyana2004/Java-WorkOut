import java.util.ArrayList;
public class Arraylist {
    //arraylist in java
    public static void main(String[] args) {
        ArrayList<String> value=new ArrayList<String>();
        value.add("hi");
        value.add("hello");
        value.add("bhai");

        for(int i=0;i<value.size();i++){
            System.out.println(value.get(i));
        }
    }
    
}
