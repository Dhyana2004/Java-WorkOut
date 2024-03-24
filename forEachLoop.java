import java.util.ArrayList;
public class forEachLoop {
    // for each loop in java
    public static void main(String[] args) {
        String []name={"dhyana","samaga","dhruva","samaga"};
        for(String element:name){
            System.out.println(element);
        }
System.out.println();
            ArrayList<String> animal=new ArrayList<String>();
            animal.add("cat");
            animal.add("dog");
            animal.add("cow");

            for(String key:animal){
                System.out.println(key);
            }
        
    }    
}
