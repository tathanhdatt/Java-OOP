package inhertance.animal;

public class Test {
  public static void main(String[] args) {
    Animal animal = new Animal("animal");
    System.out.println(animal);
    Mammal mammal = new Mammal("mammal");
    System.out.println(mammal);
    Cat cat = new Cat("cho");
    System.out.println(cat);
    Dog dog = new Dog("meo");
    System.out.println(dog);
  }
}
