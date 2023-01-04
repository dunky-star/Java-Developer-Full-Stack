package OOP2;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAddition() {
        return firstNumber + secondNumber;
    }

    public double getSubtraction() {
        return firstNumber - secondNumber;
    }

    public double getMultiplication() {
        return firstNumber * secondNumber;
    }

    public double getDivision() {

        return firstNumber / secondNumber;
    }
}
