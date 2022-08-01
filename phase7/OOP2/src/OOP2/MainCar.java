package OOP2;

public class MainCar {
    public static void main(String[] args){
        Car porsche = new Car();
        Car subaru = new Car();
        porsche.setModel("911 Turbo S.");
        subaru.setModel("Legacy B4 Twin Turbo");
        System.out.println("The car models in store are " + subaru.getModel() + " and " + porsche.getModel());
    }
}
