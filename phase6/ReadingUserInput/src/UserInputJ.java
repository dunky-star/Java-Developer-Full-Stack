/**
 * Reading user inputs from keyboard.
 * Program to calculate current age of a person in 2022 when that person
 * enters his/her year of birth (hard coded though).
 */

import java.util.Scanner;

public class UserInputJ {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = sc.nextInt();
        sc.nextLine();  // To handle next line character (Enter Key).

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("Your name is: " + name + " and your age is: " + age);

        sc.close();

    }
}