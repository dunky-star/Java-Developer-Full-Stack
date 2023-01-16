package com.dunky.exception;

public class ExceptionJava {

    public static void main(String[] args){
        int x = 20;
        int y = 0;

        System.out.println("The value of operation is: " + divideLBYL(x,y));
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
        } catch(Exception e){
            return 0;
        } finally {
            System.out.println("Divide by 0 is not possible");
        }
    }
}
