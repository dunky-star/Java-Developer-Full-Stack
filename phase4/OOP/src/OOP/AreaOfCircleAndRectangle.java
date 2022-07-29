package OOP;

public class AreaOfCircleAndRectangle {
    private static final double pi = 3.14;
    private static double Area( double r){
        if (r <= 0){
            return -1;
        }
        final double pi = 3.14;
        return pi * r * r;
    }
    private static double Area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }

    public static void main(String[] args){
        System.out.println("The area of the circle = " +Area(4));
        System.out.println("The area of the Rectangle = " +Area(10,4));
    }
}
