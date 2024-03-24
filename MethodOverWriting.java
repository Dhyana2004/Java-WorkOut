class Animal{
    void speak(){
        System.out.println("the animal is making sound");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("the dog is making sound");
    }
}
public class MethodOverWriting {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Animal animal=new Animal();
        animal.speak();
        dog.speak();
    }
}
