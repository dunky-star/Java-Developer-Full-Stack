/* Author: Geoffrey Duncan Opiyo */
import java.util.Scanner;

public class MathsOperations {
    //Addition
    public static int sumNum(int x, int y){
        int sumNum = x + y;
        return sumNum;
    }

    //Multiplication
    public static int multNum(int x, int y){
        int multNum = x * y;
        return multNum;
    }

    //Subtraction
    public static int subNum(int x, int y){
        int subNum = x - y;
        return subNum;
    }

    //Division
    public static float divNum(float x, float y){
        float divNum = x / y;
        return divNum;
    }

    //Modulo
    public static float modNum(float x, float y){
        float modNum = x % y;
        return modNum;
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println(" ");
            System.out.println("ENTER THE TWO NUMBERS TO PERFORM OPERATIONS");
            System.out.print("Enter the first number: ");
            int z = s.nextInt();
            System.out.print("Enter the second number: ");
            int w = s.nextInt();
            System.out.println("Enter the operation you would like to perform");
            System.out.println("==============================================");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = s.nextInt();
            switch(n){
                case 1:
                    sumNum(z, w);
                    System.out.println("Result : " +sumNum(z, w));
                    break;
                case 2:
                    subNum(z, w);
                    System.out.println("Result : " +subNum(z,w));
                    break;
                case 3:
                    multNum(z, w);
                    System.out.println("Result : " +multNum(z,w));
                    break;
                case 4:
                    divNum(z, w);
                    System.out.println("Result : " +divNum(z,w));
                    break;
                case 5:
                    modNum(z, w);
                    System.out.println("Result : " +modNum(z, w));
                    break;
                case 6:
                    System.exit(0);
            }

        }

    }
}
