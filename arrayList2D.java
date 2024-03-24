import java.util.*;
public class arrayList2D {
    //2D ARRAYLIST IN JAVA
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> mobile=new ArrayList<>();

        ArrayList<String> redmi=new ArrayList<String>();
        redmi.add("note 9");
        redmi.add("note 8");
        redmi.add("note 7");

        ArrayList<String> apple=new ArrayList<String>();
        apple.add("iphone10");
        apple.add("iphone11");
        apple.add("iphone12");

        ArrayList<String> google=new ArrayList<String>();
        google.add("pixel4");
        google.add("pixel5");
        google.add("pixel6");

        mobile.add(redmi);
        mobile.add(apple);
        mobile.add(google);

        System.out.println(mobile);

        System.out.println(mobile.get(2));

    }
    
}
