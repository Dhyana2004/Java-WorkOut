import java.util.*;
public class Scope_variable {
    // scope of the variable
    static double area(double radius){
        double result;
        result=pi*radius*radius;
        return result;
    }
   public static void main(String[] args) {
    double pi=3.14;
        double radius;
      
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius");
        radius=input.nextDouble();

        System.out.println(area(radius));
        System.out.println(result);
        
    }    
}
