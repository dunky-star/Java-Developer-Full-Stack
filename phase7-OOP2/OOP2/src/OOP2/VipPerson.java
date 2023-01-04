/**
 * Written by: Geoffrey Duncan O. Tweet: dunky2012, Insta: KaligsXcross
 * Create a new class called VIP person.
 * It should have 3 field names, credit limit, and an email.
 * Create 3 constructors (constructor overloading):
 * 1. 1st constructor empty should call the constructor with 3 parameters with default values.
 * 2. 2nd constructor should pass on the two values it receives and add a default value for the 3rd.
 * 3. 3rd constructor should save all fields. Create getters only for this problem.
 */
package OOP2;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Constructors

    public VipPerson() {
        this("Default name", 5000.0, "Default@email.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "Unknown@gmail.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // Getter


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
