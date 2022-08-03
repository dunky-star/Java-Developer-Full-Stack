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

class Mitsubishi extends Cars{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

public class PolyCarChallenge {
    public static void main(String[] args){

    }
}
