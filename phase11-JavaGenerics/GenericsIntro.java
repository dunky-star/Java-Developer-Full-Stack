import java.util.ArrayList;

public class GenericsIntro {
    public static void main(String[] args){
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(4);
        items.add(10);
        items.add(20);

        printDouble(items);
    }

    public static void printDouble(ArrayList<Integer> n){
        for (int i : n){
            System.out.println(i * 2);
        }
    }
}
