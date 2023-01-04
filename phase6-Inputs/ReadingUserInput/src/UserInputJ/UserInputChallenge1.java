/**
 * A program to accept user inputs and return the sum of numbers entered.
 * Checks also if a number entered is a valid integer, otherwise, returns invalid number.
 */
package UserInputJ;

import java.util.Scanner;

public class UserInputChallenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true){
            int order = counter + 1;
            System.out.print("Enter number # " + order + ": " );
            boolean isInteger = sc.hasNextInt();
            if(isInteger){
                int number = sc.nextInt();
                counter++;
                sum += number;
                if(counter == 5){
                    break;
                }
            }else{
                System.out.println("Invalid number");
            }
            sc.nextLine();  // Handle end of line (enter key).
        }
        System.out.println("Sum of numbers: " + sum);
        sc.close();

    }
}
