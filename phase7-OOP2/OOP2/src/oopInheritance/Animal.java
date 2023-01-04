/**
 * Written by: Geoffrey Duncan O. Tweet: dunky2012, Insta: KaligsXcross
 * Inheritance concept.
 */
package oopInheritance;

public class Animal {
    private String name;
    private int brian;
    private int body;
    private int size;
    private int weight;

    // Constructor
    public Animal(String name, int brian, int body, int size, int weight) {
        this.name = name;
        this.brian = brian;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrian() {
        return brian;
    }

    public void setBrian(int brian) {
        this.brian = brian;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called...");
    }

    public void move( int speed) {
        System.out.println("Animal.walk() called..." + speed);
    }
}
