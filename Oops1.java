class Car{
    String name="polo";
    int year=2007;
    String company="volsvogen";

    void display(){
      System.out.println("name="+name+"\n year="+year+"\n company="+company);
    }
}
public class Oops1 {
    public static void main(String[] args) {
    Car car=new Car();
   car.display(); 

  
    }
}
