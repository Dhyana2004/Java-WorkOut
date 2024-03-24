class Human{
    String name;
    int age;
    String work;

    Human(String name,int age,String work){
        // this is a constructor
        this.name=name;
        this.age=age;
        this.work=work;
    }
    void eat(){
        System.out.println("i am eating");
    }
    void display(){
        System.out.println("NAME:"+this.name+"\nAGE:"+this.age+"\nWORK:"+this.work);
    }
}
public class constructor {
    // constructor in java
    public static void main(String[] args) {
        Human human1=new Human("Dhyana", 18, "Student");
        Human human2=new Human("Dhruva", 16, "Student");
         human1.display();
         System.out.println();
         human2.display();  
    }
    
}
