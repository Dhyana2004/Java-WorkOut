class Car{
    private String name;
    private String company;
    private int year;
    Car(String name,String company,int year){
        this.name=name;
        this.company=company;
        this.year=year;
    }
    public String setname(){
        return name;
    }
    public String setcompany(){
        return company;
    }
    public int setyear(){
        return year;
    }
    public String getname(){
        return name;
    }
    public String getcompany(){
        return company;
    }
    public int getyear(){
        return year;
    }
    public void copy(Car x){
        this.name=x.getname();
        this.company=x.getcompany();
        this.year=x.getyear();
    }
}
public class ObjectCopy {
    // copying the object 
    //this does not works in vs code use eclips ide or the online compilers to get the output 
    public static void main(String[] args) {
        Car car1=new Car("nano", "tata", 2015);
        Car car2=new Car("xuv700", "mahendra", 2017);
        car2.copy(car1);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getname());
        System.out.println(car1.getcompany());
        System.out.println(car1.getyear());
        System.out.println();
        System.out.println(car2.getname());
        System.out.println(car2.getcompany());
        System.out.println(car2.getyear());

    }
}
