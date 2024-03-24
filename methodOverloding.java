public class methodOverloding {
    // method overloding in java
    public static void main(String[] args) {
        int a=add(1,3);
        int b=add(2,4,6);
        int c=add(1,2,3,4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
    static int  add(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    static int  add(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        return sum;
    }
    static int  add(int num1,int num2,int num3,int num4){
        int sum=num1+num2+num3+num4;
        return sum;
    }
    
}
