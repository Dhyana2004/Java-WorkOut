public interface Prey{
   void flee();
} 
public interface Predator{
    void hunt();
}
class Rabbit implements Prey{
  public void flee(){
    System.out.println("the rabbit is running");
  }
}
class Hawk implements Predator{
    public void hunt(){
        System.out.println("the hawk is hunting");
    }
}
class Fish implements Prey,Predator{
    public void flee(){
        System.out.println("this fish is flee");
    }
    public void hunt(){
        System.out.println("the fish is being hunt by hawk");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Rabbit rabbit=new Rabbit();
        Hawk hawk=new Hawk();
        Fish fish=new Fish();
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
