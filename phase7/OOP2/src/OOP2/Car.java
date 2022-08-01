/**
 * Class is a blue-print for creating an object. Real World objects have state and behaviour.
 * Class variables are known as member variables and method variables are known as local variables.
 * Class variables are accessible anywhere within that class.
 * Local variables are accessible within that method body.
 */
package OOP2;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color ="Blue";
    public void print(){
        System.out.print("Car color: " + color);
    }
}
