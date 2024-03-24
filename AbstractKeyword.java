abstract class Vehicle{
    abstract void go();
    abstract void breaking();
}
class Car extends Vehicle{
    void go(){
        System.out.println("the vehicle is ready to delever");
    }
    void breaking(){
        System.out.println("the car applied the break");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        Car car=new Car();
        car.go();
        car.breaking();
    }
}
