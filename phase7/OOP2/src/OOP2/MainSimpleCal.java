package OOP2;

public class MainSimpleCal {
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAddition());
        System.out.println("subtract = " + calculator.getSubtraction());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplication());
        System.out.println("divide = " + calculator.getDivision());
    }
}
