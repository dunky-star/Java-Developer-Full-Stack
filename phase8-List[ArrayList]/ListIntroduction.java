import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListIntroduction {
    public static void main(String[] args){
        // step 1. Converting an array to List
        String[] items = {"Apple", "Guava", "Mangoes", "Bananas", "Oranges", "Pawpaw"};

        // step 2.
        List<String> list = List.of(items);

        // System.out.println(list);
        // System.out.println(list.getClass().getName());
        // Transforming an array into List.
        // Step 3.
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yoghurt");
        System.out.println(groceries);
        ArrayList<String> nextList = new ArrayList<>(
                List.of("Pickles", "Mustard", "Cheese"));
        groceries.addAll(nextList);
        System.out.println(groceries);

        // Getting an item by it index in an ArrayList.
        System.out.println("\nThird item in the groceries list = " + groceries.get(2));

        // Simple search on an ArrayList
        if(groceries.contains("Mustard")){
            System.out.println("The list contains Mustard");
        }else{
            System.out.println("List contains no Mustard");
        }

        // Removing an element from the Arraylist
        groceries.remove(2);
        System.out.println("Groceries after removing an element at index 2: " + groceries);

        // Removing all list elements
        groceries.clear();
        System.out.println("Groceries after removing all elements: " + groceries);
        System.out.println("isEmpty: " + groceries.isEmpty());
        // Repopulating ArrayList
        groceries.addAll(List.of("Apples", "Milk", "Mustard"));
        groceries.addAll(Arrays.asList("Eggs", "Pickles", "Mustard", "Ham"));

        // Sorting List
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        // Reverse sorting
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        // Converting ArrayList to an Array
        var groceryArray = groceries.toArray(new String [groceries.size()]);
        System.out.println("New grocery array: " + Arrays.toString(groceryArray));
    }
}
