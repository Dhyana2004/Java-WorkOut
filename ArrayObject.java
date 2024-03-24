class Car{
    String name;
    Car(String name){
        this.name=name;
    }
}
public class ArrayObject {
    public static void main(String[] args) {
        // this is one way
      Car[] car=new Car[3];
      
      Car car1=new Car("suzuki");
      Car car2=new Car("tata");
      Car car3=new Car("bmw");
    // this is another way insted of assigning
    
    //Car[] car={car1,car2,car3};
      /*car[0]=car1;
      car[1]=car2;
      car[2]=car3;
*/
       // this gives the address of this class
      System.out.println(car[0]);
      System.out.println(car[1]);
      System.out.println(car[2]);

     // this display the content in the array
      System.out.println(car[0].name);
      System.out.println(car[1].name);
      System.out.println(car[2].name);


    }
    
}
