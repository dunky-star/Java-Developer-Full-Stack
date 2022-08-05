package JavaArrays;

import java.util.Scanner;

/**
 * @author: Geoffrey Duncan Opiyo
 * Create a program using arrays that sorts a list of integers in descending order.
 *  Set up the program so that the numbers to sort are read in from the keyboard.
 *  Implement the following methods - getIntegers, printArray, and sortIntegers.
 *  getIntegers returns an array of entered integers from keyboard.
 *  printArray prints out the contents of the array
 *  and sortIntegers should sort the array and return a new array containing the sorted numbers
 * you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array.
 */

public class ArrayChallenge1 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(10);
        // sorting method call
        int[] sorted = sortIntegers(myIntegers);
        // Displaying result by printArray call
        printArray(sorted);

    }

    // Method to accept integer values from the keyboard.
    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values: ");
        int[] myArray = new int[capacity];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }

        return myArray;
    }

    // Method to print the array
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " content is " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}

