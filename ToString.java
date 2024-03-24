class Car{
    String name="aulto800";
    String company="suzuki";
    String colour="white";

    public String toString(){
        return name+"\n"+company+"\n"+colour+"\n";
    }
}
public class ToString {
    public static void main(String [] args){
        Car car=new Car();
       //System.out.println(car.toString());
        System.out.println(car);

    }
}
