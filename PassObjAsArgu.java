class Car {
    String name;

    // Constructor to initialize instance variables
    Car(String name) {
        this.name = name;
    }
}

class Garage {
    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the basement.");
    }
}

public class PassObjAsArgu {
    public static void main(String[] args) {
        Car car = new Car("Audi");
        Garage garage = new Garage();

        garage.park(car);
    }
}
