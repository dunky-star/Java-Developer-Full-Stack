package PolyChallengeJ;

/**
 * @Author: Geoffrey Duncan O.
 * @since: Java 17 (2022).
 * Challenge: Create a base class called Car, with fields engine, cylinders, wheels, etc.
 * Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
 * Cylinders and names would be passed parameters. Create appropriate getters, create some methods like startEngine, accelerate, and brake.
 * Then create 3 sub-classes for your favorite vehicles. Override the appropriate methods to demonstrate polymorphism in use.
 */

class Cars{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    // Constructor
    public Cars(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }
    // Getter

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Subaru extends Cars{

    public Subaru(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Subaru -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Subaru -> accelerate()";
    }

    @Override
    public String brake() {
        return "Subaru -> brake()";
    }
}


class Toyota extends Cars{

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getName() + " -> brake()";
    }
}

public class PolyCarChallenge {
    public static void main(String[] args){
        Cars cars = new Cars(8, "Base car");
        System.out.println(cars.startEngine());
        System.out.println(cars.accelerate());
        System.out.println(cars.brake());

        Subaru subaru = new Subaru(4, "Legacy B4 TT");
        System.out.println(subaru.startEngine());
        System.out.println(subaru.accelerate());
        System.out.println(subaru.brake());

        Toyota toyota = new Toyota(6, "Mark X");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

    }

}
