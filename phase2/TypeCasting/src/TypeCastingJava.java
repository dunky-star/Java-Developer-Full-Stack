/* Geoffrey Duncan Opiyo
 * Widening Casting (automatically) - converting a smaller type to a larger type size.
 * byte -> short -> char -> int -> long -> float -> double.
 * Narrowing Casting (manually) - converting a larger type to a smaller size type.
 * double -> float -> long -> int -> char -> short -> byte
 */
public class TypeCastingJava {
    public static void main(String[] args){
        int intValue = 190;
        double doubleValue = intValue;  // Automatic casting: int to double.
        System.out.println("\nThe casted int value " + intValue + " to double = " + doubleValue );

        float floatValue = 9.78f;
        int myIntValue = (int) floatValue; // Manual casting: float to int.
        System.out.println("The casted float value " + floatValue + " to an integer = " + myIntValue );
    }
}
