/* Geoffrey Duncan Opiyo
 * Widening Casting (automatically) - converting a smaller type to a larger type size.
 * byte -> short -> char -> int -> long -> float -> double.
 * Narrowing Casting (manually) - converting a larger type to a smaller size type.
 * double -> float -> long -> int -> char -> short -> byte
 */
public class TypeCastingJava {
    public static void main(String[] args){
        int intValue = 190;
        byte byteValue = 27;
        short shortValue = 1000;
        double doubleValue = intValue;  // Automatic casting: int to double.
        System.out.println("\nThe casted int value " + intValue + " to double = " + doubleValue );

        float floatValue = 9.78f;
        int myIntValue = (int) floatValue; // Manual casting: float to int.
        System.out.println("The casted float value " + floatValue + " to an integer = " + myIntValue );

        String data = String.valueOf(intValue);  // Converting Integer to string data type.
        System.out.println("The Int. value of " + intValue + " to String = " + data);

        String stringData = "2000";
        int intData = Integer.parseInt(stringData); //  Converting String to Integer data type.
        System.out.println("\nThe value of String " + stringData + " to Int = " + intData);

        long longTotal = 100000L + 20L * (byteValue + shortValue + intValue);
        System.out.println("Long computation = " + longTotal );


    }
}
