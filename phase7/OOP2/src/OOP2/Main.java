package OOP2;

public class Main {
    public static void main(String[] args){
        Car porsche = new Car();
        Car subaru = new Car();
        subaru.setModel("Legacy B4 Twin Turbo.");
        System.out.println("The model is " + subaru.getModel());
    }
}
