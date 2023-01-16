package com.dunky.exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Arithmetic2 {

    public static void main(String[] args){
        try {
            double result = divide();
            System.out.println(result);
        }catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static double divide() {
        double x;
        double y;
        x = getInt();
        y = getInt();
        System.out.println("x is: " + x + " y is: " + y);
        return (x/y);

    }

    private static double getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        while(true){
            try{
                return sc.nextDouble();
            }catch (Exception e){
                // Go round again
                sc.nextLine();
                System.out.println("Please enter a number using only the digits 0 - 9");
            }
        }
    }
}
