package com.dunky.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithematicOps {

    public static void main(String[] args){
        int x = getInt();
        int y = getInt();
        System.out.println("The value of operation is: " + divideLBYL(x,y));
        System.out.println("The value of operation is: " + divideEAFP(x,y));

    }

    private static int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        try {
            return sc.nextInt();
        } catch(InputMismatchException e){
            return 0;
        }
    }
    private static int divideLBYL(int x, int y){
        if (y != 0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try {
            return x/y;
        } catch(ArithmeticException e){
            return 0;
        }
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }
}
