import java.util.Scanner;

/**
 * @author: Geoffrey Duncan O.
 * ArrayList Challenge. Create an interactive console program.
 * that gives a user a menu of options below:
 * 0 - to shutdown.
 * 1 - to add item(s) to list (comma delimited list).
 * 2 - to remove any item (Comma delimited list).
 * Enter a number for which you want to do:
 */

public class ArrayListChallenge {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        boolean flag = true;
        while(flag){
            // Calling the print method for user actions required.
            printActions();
            switch(Integer.parseInt(sc.nextLine())){
                default -> flag = true;
            }

        }


    }

    // Method that displays the menu options (Taking advantage of Java textBlock feature).
    public static void printActions(){
        System.out.println("\n");
        String textBlock = """
                 Available actions:
                 0 - to shutdown.
                 1 - to add item(s) to list (comma delimited list).
                 2 - to remove any item (Comma delimited list).
                 Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
}
