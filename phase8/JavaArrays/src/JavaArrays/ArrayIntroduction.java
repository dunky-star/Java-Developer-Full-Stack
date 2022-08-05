package JavaArrays;

/**
 * @author: Geoffrey Duncan O.
 * Arrays allow us to store multiple values of the same data type.
 * It's a data structure that allows you to store sequence of values that hold same type.
 * Eg: An array of integers, an array of characters, an array of Strings, etc.
 * It works for all primitive types and even objects like a String.
 */

public class ArrayIntroduction {
    public static void main(String[] args){
        int[] myIntArray = new int[5];
        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 50;
        double[] myDoubleArray = new double[5];
        System.out.println("The array at index[0] is " + myIntArray[0] + "\n");
        System.out.println("===========================");

        for(int i = 0; i < myIntArray.length; i++){
        System.out.println("The array at index# " + i + " is " + myIntArray[i]);
        }
    }
}
