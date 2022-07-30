/**
 * Write a method with the name sumOfDigits, which has one long parameter.
 * If parameter >= 10, then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value. Numbers from 0-9 has one digit, so we don't
 * want to process them, also return -1 for negative numbers.
 */
package ConditionalAndLoops;

public class SumOfDigitChallenge {

    private static long sumOfDigits(long number){
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

        System.out.println("The sum of digit in 155 is " + sumOfDigits(155));
        System.out.println("The sum of digit in 4 is " + sumOfDigits(4));
        System.out.println("The sum of digit in 256772122179 is " + sumOfDigits(256772122179L));

    }
}
