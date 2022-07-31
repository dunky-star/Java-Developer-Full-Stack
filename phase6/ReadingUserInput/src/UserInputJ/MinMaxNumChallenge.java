/**
 * Min and Max number challenge:
 * Read the number from the console entered by the user, and print the minimum and maximum number.
 * If the user enters an invalid number, break out of the loop and print
 * the minimum and maximum number.
 */
package UserInputJ;

import java.util.Scanner;

public class MinMaxNumChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;

        while (true) {
            System.out.println("Enter Number: ");
            boolean isAnInteger = sc.hasNextInt();
            if (isAnInteger) {
                int number = sc.nextInt();
                if(number > maxValue){
                    maxValue = number;
                }
                if(number < minValue){
                    minValue = number;
                }

            } else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("Min = " + minValue + " , Max = " + maxValue);
        sc.close();
    }

}
