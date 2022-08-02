// Child class
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
}
