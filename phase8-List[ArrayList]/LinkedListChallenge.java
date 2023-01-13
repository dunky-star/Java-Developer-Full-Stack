import java.util.LinkedList;

/**
 * @author: Geoffrey Duncan O.
 * LinkedList Challenge. Create list of places ordered by distance from the starting point
 * using ListIterator to move both backward and forward.
 * In addition, you'll create an interactive program with the following menu item options.
 * Available action (select word or letter)
 * (F)orward
 * (B)ackward
 * (L)ist places
 * (M)enu
 * (Q)uit
 */

record Place(String name, int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LinkedListChallenge {
    public static void main(String[] args){

        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place Adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, Adelaide);
        System.out.println("\n" + placesToVisit);

    }
    public static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        list.add(place);
    }
}
