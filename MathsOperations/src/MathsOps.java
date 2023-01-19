/*
 * Geoffrey Duncan Opiyo: Simple Maths program based on addition, multiplication and division.
 */
public class MathsOps {
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

    //Division
    public static float divNum(float x, float y){
        float divNum = x/y;
        return divNum;
    }

    public static void main(String[] args){
        System.out.println("The sum of two numbers X and Y = " + sumNum(30, 30));
        System.out.println("The product of two numbers X and Y = " + multNum(40,2));
        System.out.println("The division of two number Z/Y = " +divNum(30,90));

    }
}
