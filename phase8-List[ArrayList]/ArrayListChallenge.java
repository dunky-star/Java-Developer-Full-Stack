import java.util.ArrayList;
import java.util.Comparator;
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

        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;

        while(flag){
            // Calling the print method for user actions required.
            printActions();

            switch(Integer.parseInt(sc.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    // Method that add the groceries list items
    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");

        for (String i: items) {
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0) {
                groceries.add(trimmed);
            }
        }

    }

    // Method that add the groceries list items
    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = sc.nextLine().split(",");
                for (String i: items) {
                   String trimmed = i.trim();
                   groceries.remove(trimmed);
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
