class Vehicle{
  public void go(){

   }
}
class Car extends Vehicle{
    public void go(){
      System.out.println("the car is moving");
    }
}
class Bike extends Vehicle{
    public void go(){
        System.out.println("bike is moving");
    }
}
class Truck extends Vehicle{
    public void go(){
        System.out.println("the truck is moving");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        Car car=new Car();
        Bike bike=new Bike();
        Truck truck=new Truck();

        Vehicle[] race={car,bike,truck};
        for(Vehicle x:race){
            x.go();
        }
    }
}
