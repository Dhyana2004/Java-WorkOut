public class PrintF {
    // printf() in java
    public static void main(String[] args) {
        boolean a=true;
        char b='#';
        String c="bhai";
        double d=32.12;
        int e=123;

        System.out.printf("%d \n",e);
        System.out.printf("%c \n",b);
        System.out.printf("%b \n",a);
        System.out.printf("%s \n",c);
        System.out.printf("%f \n",d);

        //width in java
        String name="DHYANA";
        System.out.printf("%10s \n",name);
        System.out.printf("%-10s \n\n",name);

        //precision in java

        double num=123.456;
        System.out.printf("%f \n",num);
        System.out.printf("%.5f \n\n",num);

        //flags in java
        double digit=123456789;
        System.out.printf("%f \n",digit);
        System.out.printf("%20f \n",digit);
        System.out.printf("%+f \n",digit);
        System.out.printf("-%f \n",digit);
        System.out.printf("%,f \n",digit);

    }
    
}
