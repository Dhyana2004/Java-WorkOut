import java.util.Scanner;

class Animal {
    public void sound() {
        System.out.println("animal makes brrrr!! sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("cat makes meow sound");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {
        Animal animal;
        Cat cat = new Cat();
        Dog dog = new Dog();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter which animal sound you want to hear:");
        System.out.println("1. CAT\n2. DOG");
        int choice = input.nextInt();
        if (choice == 1) {
            animal = new Cat();
            animal.sound();
        } else if (choice == 2) {
            animal = new Dog();
            animal.sound();
        } else {
            animal = new Animal();
            animal.sound();
        }
    }
}
