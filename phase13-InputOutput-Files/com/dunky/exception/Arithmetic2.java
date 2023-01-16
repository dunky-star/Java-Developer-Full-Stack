package com.dunky.exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Arithmetic2 {

    public static void main(String[] args){
        double result = divide();
        System.out.println(result);
    }

    private static double divide() {
        double x;
        double y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("x is: " + x + " y is: " + y);
            return (x/y);
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("No suitable input");
        } catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by 0");
        }

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
