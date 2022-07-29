/**
 * Geoffrey Duncan Opiyo.
 * Control flow in Java.
 */
package ConditionalAndLoops;

public class IfStatementBasic {
    public static void main (String[] args){
        // Using IF-ELSE statement.
        int value = 3;
        if ( value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else{
            System.out.println("Value was not 1 or 2");
        }
        // Alternative approach is using switch-case statement
        String month = "january";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("The month is JAN.");
                break;
            case "february":
                System.out.println("The month is Feb.");
                break;
            case "march": case "april": case "may":
                System.out.println("Rainy months of the year.");
                break;
            default:
                System.out.println("It is Dec already.");
                break;
        }
    }

}
