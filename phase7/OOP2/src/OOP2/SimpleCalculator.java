package OOP2;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double setFirstNumber(double x) {
        this.firstNumber = x;
        return x;
    }

    public double setSecondNumber(double y) {
        this.secondNumber = y;
        return y;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {

        return firstNumber / secondNumber;
    }
}
