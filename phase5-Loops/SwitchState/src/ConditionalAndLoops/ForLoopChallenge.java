/**
 * Written by: Geoffrey Duncan O. Insta: KaligsXcross, Tweet: dunky2012
 * Challenge statement: Create a "For Loop" using a range of numbers from 1 to 1000 inclusive.
 * Sum all the numbers that can be divided with both 3 and also with 5.
 * For those numbers that met the above conditions, print out the numbers.
 * Break out of the loop once you find 5 numbers that match the above condition.
 * Print the sum of the total numbers that met the condition after breaking out of the loop.
 */
package ConditionalAndLoops;

public class ForLoopChallenge {

    public static void main(String[] args){

        int count = 0;
        int sum = 0;

        for (int i = 1; i<= 1000; i++){
            if ((i%3 == 0) && (i%5 == 0)){
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
