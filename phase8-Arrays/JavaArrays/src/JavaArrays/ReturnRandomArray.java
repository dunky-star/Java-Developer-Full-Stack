package JavaArrays;

import java.util.Arrays;
import java.util.Random;

public class ReturnRandomArray {
    public static void main(String[] args){

        // The method call to produce unsorted array.
        int[] unsortedArray = getRandomArray(20);
        // Sorting the array.
        Arrays.sort(unsortedArray);
        // Printing sorted result.
        System.out.println("\nSorted Array:" + Arrays.toString(unsortedArray) + " \n");

        int[] thirdArray = getRandomArray(10);
        System.out.println("Third Array:" + Arrays.toString(thirdArray) + " \n");

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Fourth Array" + Arrays.toString(fourthArray));

    }

    // Method that returns an array on random integers.
    public static int[] getRandomArray(int len){
        Random random = new Random();

        int[] newInt = new int[len];

        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
