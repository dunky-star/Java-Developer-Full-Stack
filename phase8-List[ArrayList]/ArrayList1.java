import java.util.ArrayList;

/**
 * @author: Geoffrey Duncan O.
 * ArrayList is a growable array. i.e: resizeable.
 */

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }
}

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter", "Nun", 10 ));
        groceryList.add(new GroceryItem("Rice", "Bishimati", 5 ));
        groceryList.add(new GroceryItem("Meat"));
    }
}
