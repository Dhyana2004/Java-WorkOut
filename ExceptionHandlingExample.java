import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    try{
        System.out.println("enter a number");
        int number1=input.nextInt();
        System.out.println("enter the second number");
        int number2=input.nextInt();
        int result=number1/number2;
        System.out.println("result="+result);
    }
    catch(ArithmeticException e){
        System.out.println("you cant divide by zero this is against the law of maths");
    }
    catch(InputMismatchException e){
        System.out.println("enter the correct value");
    }
    finally{
        // helps to close the scanner
        System.out.println("this will always exexuted");
    }
}
}
