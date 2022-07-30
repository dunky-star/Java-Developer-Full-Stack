/**
 * Create a method isEvenNumber that takes a parameter of type int.
 * Its purpose is to determine if the argument passed to the method is an even number or not.
 * Should return TRUE if an even number, otherwise FALSE.
 */
package ConditionalAndLoops;

public class WhileLoopIf {
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 2;
        int endNumber = 30;
        while (number <= endNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

        }
        System.out.println(number + " is Even number");
    }
}
