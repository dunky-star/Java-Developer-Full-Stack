public class PrimitiveDataTypes {
    public static void main(String[] args){

        boolean k = true;            // boolean = 1 bit (true/false).
        byte byteValue = 100;         // byte = 8 bits, range: -128 to 127.
        short shortValue = -30000;    // short = 2 bytes, range: -32768 to 32767.
        int intValue = 1000000;       // int = 4 bytes, range: -2^32 to (2^31) - 1.
        long myLong = 9000L;           // long = 8 bytes, Range: -2^63 to (2^63) - 1.
        float myFloat = 2.5F;         // float = 4 bytes.
        double myDouble = 2.8;        // double = 8 bytes.
        char myChar = 'M';            // char = 2 bytes, it also stores a single character
                                      // a minimum value of '\u0000' and a maximum value of '\uffff'.
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(" ");
        System.out.println("The min value of an Int: " + Integer.MIN_VALUE + "\nThe max value of an Int: " + Integer.MAX_VALUE);
        System.out.println("The busted MAX Int value: " +(maxValue + 1));  // Overflow.
        System.out.println("The busted MIN Int value: " +(minValue - 1));  // Underflow.

        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("The byte MIN value: " + byteMinValue);
        System.out.println("The byte MAX value: " + byteMaxValue);

        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("The Short MIN value: " + shortMinValue);
        System.out.println("The Short MAX value: " + shortMaxValue);

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is boolean data type, it's not car");
        }

        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }else{
            System.out.println("wasCar is not isCar");
        }

        int ageOfCustomer = 20;
        boolean isEigtheenOrAbove = (ageOfCustomer >= 18) ? true : false;
        if(isEigtheenOrAbove) {
            System.out.println("This is an adult");
        }else{
            System.out.println("This is still a child");
        }

    }
}
