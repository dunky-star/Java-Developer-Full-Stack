/**
 * Written by: Geoffrey Duncan O.
 * Sample Java program to demonstrate how to use the filter() on Java collections.
 */
package phase9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalFilterJ {
    public static void main(String[] args){
        List<String> listOfStudents = new ArrayList<>(); // Creating arrayList String type for data storage.
        listOfStudents.add("Christine"); // Storing data in arrayList.
        listOfStudents.add("Duncan");
        listOfStudents.add("Anajana");
        listOfStudents.add("Deus Kanshabe");
        listOfStudents.add("Sheena A");
        listOfStudents.add("Murphy Laws");
        listOfStudents.add("Shaka John");
        listOfStudents.add("Optimus Prime");
        System.out.println(listOfStudents); // Printing array list.

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18, 20, 22); // Creating arrayList Int type for data storage.
        Integer lowestCommonMultiple = listOfNumbers.stream()
                                   .filter(i -> i % 2 == 0)
                                   .filter(i -> i % 3 == 0)
                                   .findFirst().get(); // To find first number from filtered list.
        System.out.print(lowestCommonMultiple);


    }


}
