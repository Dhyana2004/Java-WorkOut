 class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

 class Hero extends Human {
    String ability;

    Hero(int age, String name, String ability) {
        super(age, name);
        this.ability = ability;
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Hero hero = new Hero(42, "Ironman", "Technology");
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.ability);
    }
}
