import java.util.ArrayList;

/**
 * @author: Geoffrey Duncan O.
 * ArrayList is a growable List. i.e: resizeable unlike Arrays which are fixed sized.
 * ArrayList elements are accessed with get and set methods.
 * An index of the last element = arrayList.size - 1
 */

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter", "Nun", 10 ));
        groceryList.add(new GroceryItem("Rice", "Bishumati", 5 ));
        groceryList.add(new GroceryItem("Meat"));
        groceryList.add(0, new GroceryItem("Apple", "Green", 8));
        groceryList.remove(2);

        System.out.println(groceryList);
    }
}
