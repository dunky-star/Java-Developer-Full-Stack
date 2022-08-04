package oopMasterChallenge;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 4.60, "White");
        super.addHamburgerAddition1("Chip", 1.91);
        super.addHamburgerAddition2("Drink", 2.0);
    }
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
