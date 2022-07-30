package ConditionalAndLoops;

public class SumOfDigitChallenge {

    private static long sumOfDigit(long number){
        if (number < 10){
            return -1;
        }
        long sum = 0;
        // 125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0){
            // extract the least-significant digit.
            long digit = number % 10;
            sum += digit;

            // Drop least-significant digit.
            number /= 10;  // Same as number = number / 10;

        }
        return sum;
    }
    public static void main(String[] args){

        System.out.println("The sum of digit in 155 is " + sumOfDigit(155));
        System.out.println("The sum of digit in 4 is " + sumOfDigit(4));
        System.out.println("The sum of digit in 256772122179 is " + sumOfDigit(256772122179L));

    }
}
