import java.util.Random;
public class randomnumber {
    //generating the random number in java
    public static void main(String[] args) {
        Random random=new Random();

        int x=random.nextInt();
        System.out.println(x);

        int a=random.nextInt(1,6);
        System.out.println(a);

        double b=random.nextDouble(1,10);
        System.out.println(b);

        boolean c=random.nextBoolean();
        System.out.println(c);

    }
    
}
