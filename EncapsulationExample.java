class Car{
    private String name;
    private String model;
    private int year;

    Car(String name,String model,int year){
        this.name=name;
        this.model=model;
        this.year=year;
    }
    public String getname(){
        return name;
    }
    public String getmodel(){
        return model;
    }
    public int getyear(){
        return year;
    }
}
public class EncapsulationExample {
    public static void main(String[] args) {
        Car car=new Car("nano", "TATA", 2015);
        System.out.println(car.getyear());
    }
}
