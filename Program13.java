import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the text of line  ");
        String i=input.nextLine();

        System.out.println("enter the boolean input");
        boolean a=input.nextBoolean();

        System.out.println("enter the byte input");
        byte b=input.nextByte();

        System.out.println("enter the double value");
        double c=input.nextDouble();

        System.out.println("enter the float value");
        float d=input.nextFloat();

        System.out.println("enter the int value");
        int e=input.nextInt();

        System.out.println("enter the string value");
        String f=input.next();

        System.out.println("enter the long int value");
        long g=input.nextLong();

        System.out.println("enter the short int value ");
        short h=input.nextShort();

        System.out.println("entered boolean value is "+a);
        System.out.println("entered byte value is"+b);
        System.out.println("entered double value is "+c);
        System.out.println("entered float value is "+d);
        System.out.println("entered int value is"+e);
        System.out.println("entered string value is"+f);
        System.out.println("entered long int value is "+g);
        System.out.println("entered short int value is "+h);
        System.out.println("entered text of line is "+i);
    }
}
