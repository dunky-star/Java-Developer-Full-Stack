package oopMasterChallenge;

public class Main {
    public static void main(String[] args) {
        // Testing
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 5.50, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 3.0);
        hamburger.addHamburgerAddition2("Lettuce", 4.5);
        hamburger.addHamburgerAddition3("Cheese", 6.0);
        price = hamburger.itemizeHamburger();
        System.out.println("The total Burger price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 8.00);
        healthyBurger.addHamburgerAddition1("Egg", 6.50);
        healthyBurger.addHealthAddition1("Lentils", 10.2);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger dBurger = new DeluxeBurger();
        dBurger.itemizeHamburger();

    }
}
