class Bhai{
    String name;
    // this is static variable
    static int noOfFrnds;
    Bhai( String name){
        this.name=name;
        noOfFrnds++;

    }
    // this is a static method
    static void displayfrnds(){
        System.out.println("total no fo frnds="+noOfFrnds);
    }
                    
                


}
public class StaticKeyword {
    public static void main(String[] args) {
        Bhai bhai1=new Bhai("dhruva");
        Bhai bhai2=new Bhai("dhyana");
        Bhai bhai3=new Bhai("baversi");
        Bhai bhai4=new Bhai("loveday");
       

        Bhai.displayfrnds();
    }
}
