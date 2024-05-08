public class math {
    //some usefull math functions in java 
    public static void main(String[] args) {
        
        int a=10;
        int b=30;
        int c=Math.min(a, b);
        System.out.println(c);

        int d=Math.max(a, b);
        System.out.println(d);

        int sqt=11;
        double ans=Math.sqrt(sqt);
        System.out.println(ans);

        double pi=3.14;
        double result=Math.ceil(pi);
        System.out.println(result);
        double result1=Math.floor(pi);
        System.out.println(result1);

        double num=3.5,num2=3.6;
        System.out.println(Math.round(num));
        System.out.println(Math.round(num2));
    }
}
