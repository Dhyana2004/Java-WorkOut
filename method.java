public class method {
    //methodsa in java
    public static void main(String[] args) {
        hello();
        hello1("dhyana");
        int x=10;
        int y=30;
       int z= add(x,y);
       System.out.println(z);
    }
    static void hello(){
        // simple method without arguments
        System.out.println("hello this is method in java");
    }
    static void hello1(String name){
        //method with passing argument
        System.out.println("hello"+" " +name+"how are you");
    }
    static int add(int a,int b){
        //method with return type
        int sum;
        sum=a+b;
        return sum;
    }
    
}
