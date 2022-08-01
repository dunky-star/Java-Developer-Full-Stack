package OOP2;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public double setFirstNumber(double x){
        this.firstNumber = firstNumber;
        return x;
    }
    public double setSecondNumber(double y){
        y = this.firstNumber;
        return y;
    }

    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        return x + y;
    }
    public double getSubtractionResult(){
        return x - y;
    }
    public double getMultiplicationResult (){
        return x * y;
    }
    public double getDivisionResult  (){
        return x / y;
    }

}

