/**
 * Method overloading; Create a method which can perform 1). The sum of two numbers
 * 2). The sum of three numbers and 3). The sum of four numbers.
 * Each method to have parameters passed to it with numbers to sum.
 */
package OOP;

public class SumOfNumbers {
    private static int sumOfNumbers(int a, int b){
        return a + b;
    }
    private static int sumOfNumbers(int a, int b, int c){
        return a + b + c;
    }
    private static int sumOfNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }
    public static void main(String[] args){
        System.out.println("The sum of two numbers a and b is: " + sumOfNumbers(10, 20));
        System.out.println("The sum of three numbers a, b and c is: " + sumOfNumbers(10, 20, 30));
        System.out.println("The sum of four numbers a, b, c  and d is: " + sumOfNumbers(10, 20, 30, 40));

    }
}
