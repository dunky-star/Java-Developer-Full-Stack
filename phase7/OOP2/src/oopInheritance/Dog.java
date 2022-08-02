/**
 * Written by: Geoffrey Duncan O. Tweet: dunky2012, Insta: KaligsXcross
 * Inheritance concept.
 * The keyword [super] is used to access/call the parent class members (methods/variables).
 * The keyword [this] is used to call the current class members (variable and methods).
 * This is required when we have a parameter with the same name as an instance variable.
 * We can use both of them anywhere in the class except the static areas (the static block or static method).
 * Any attempt to do so will lead to a compile-time error.
 */
package oopInheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brian, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brian, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called...");
    }

    @Override
    public void eat() {
        System.out.println("Dor.eat() called...");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.move() called...");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called...");
        super.move(20);
    }
}
