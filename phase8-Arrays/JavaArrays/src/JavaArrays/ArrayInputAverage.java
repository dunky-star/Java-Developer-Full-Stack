package JavaArrays;
/**
 * Write a program that accepts 5 numbers from a keyboard input then store them in an array.
 * Finally, get the average of those numbers.
 */

import java.util.Scanner;

public class ArrayInputAverage {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getNumbers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is: " + getAverage(myIntegers));
    }

    // Method for getting values from the keyboard.
    public static int[] getNumbers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        return values;
    }

    // Method for calculating the average
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
