package oopInheritance;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1,1, 5,5 );
        Dog dog = new Dog("dunny", 1, 1, 4,20,2, 4, 1,10, "Long silky" );

        dog.eat();
        dog.walk();
        dog.run();
    }
}
