import java.util.*;
public class project1 {
    //finding the hypothenisis of the triangle
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double side1;
        double side2;
        double side3;

        System.out.println("enter the first side");
        side1=input.nextDouble();
        System.out.println("enter the side");
        side2=input.nextDouble();

        side3=Math.sqrt((side1*side1)+(side2*side2));
        System.out.println("hypotenuse is"+side3);
    }
}
