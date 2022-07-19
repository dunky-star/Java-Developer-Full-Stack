public class PrimitiveDataTypes {
    public static void main(String[] args){

        boolean k = false;            // boolean = 1 bit (true/false).
        byte byteValue = 100;         // byte = 8 bits, range: -128 to 127.
        short shortValue = -30000;    // short = 2 bytes, range: -32768 to 32767.
        int intValue = 1000000;       // int = 4 bytes, range: -2^32 to (2^31) - 1.
        long myLong = 9000;           // long = 8 bytes, Range: -2^63 to (2^63) - 1.
        float myFloat = 2.5F;         // float = 4 bytes.
        double myDouble = 2.8;        // double = 8 bytes.
        char myChar = 'M';            // char = 1 bytes, it also stores a single character
                                      // a minimum value of '\u0000' and a maximum value of '\uffff'.
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println(" ");
        System.out.println("The min value of an Int: " + Integer.MIN_VALUE + "\nThe max value of an Int: " + Integer.MAX_VALUE);

    }
}
