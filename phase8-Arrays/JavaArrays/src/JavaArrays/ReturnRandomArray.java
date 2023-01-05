package JavaArrays;

import java.util.Arrays;
import java.util.Random;

public class ReturnRandomArray {
    public static void main(String[] args){

        // The method call to produce first array.
        int[] firstArray = getRandomArray(20);
        // Sorting the array.
        Arrays.sort(firstArray);
        // Printing sorted result.
        System.out.println("\nFirst Array:" + Arrays.toString(firstArray) + " \n");

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
