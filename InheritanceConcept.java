class Parking{
    String type;

    void park(){
        System.out.println("the car is parked");
    }
}
class Car extends Parking{
    String name="scorpio";
    int wheel=4;
   
}

public class InheritanceConcept {
    //  inheritance in java demonstartion
    public static void main(String[] args) {
        Parking parking=new Parking();
        Car car=new Car();
        System.out.println(car.name);
        car.park();
       
    }
    
}
