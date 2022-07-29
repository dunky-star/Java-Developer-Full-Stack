package ConditionalAndLoops;

public class CalculateInterestRate {
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
    public static void main(String[] args){
       System.out.println("\n10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
    }
}
