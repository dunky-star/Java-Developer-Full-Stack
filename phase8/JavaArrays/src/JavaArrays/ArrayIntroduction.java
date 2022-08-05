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
        int[] myIntArray = new int[10];

        myIntArray[0] = 10;
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        myIntArray[3] = 40;
        myIntArray[4] = 50;

        // Alternatively. Array can be defined initialized with a for loop:
        int[] myIntegerArr = new int[20];
        for (int i = 0; i < myIntegerArr.length; i++) {
            myIntegerArr[i] = i * 20;
        }
        printArray(myIntegerArr); // print method call.


        // Alternatively. Array can be defined directly with curly braces as:
        double[] myDoubleArray = {1.0, 2.0, 3.0, 4.0, 5.0, 60.0, 70.0,80.0, 90.5};
        String[] myStringArray = {"Duncan", "Kaligs", "Kei", "Boni", "Deus"};

        System.out.println("The myDoubleArray at index[5] is " + myDoubleArray[5] + "\n");
        System.out.println("===========================");

        System.out.println("The myStringArray at index[2] is " + myStringArray[2] + "\n");
        System.out.println("===========================");

        for(int i = 0; i < myIntArray.length - 5; i++){
        System.out.println("The array at index# " + i + " is " + myIntArray[i]);
        }
    }

    // Print method
    public static void printArray(int[] arrayJ){
        for (int i = 0; i < arrayJ.length; i++){
            System.out.println("Element " + i + ", value is " + arrayJ[i]);
        }

    }

}
