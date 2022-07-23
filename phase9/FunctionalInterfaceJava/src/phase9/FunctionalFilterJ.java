/**
 * Written by: Geoffrey Duncan O.
 * Sample Java program to demonstrate how to use the filter() method of Stream class on Java collections.
 */
package phase9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalFilterJ {
    public static void main(String[] args) {
        List<String> listOfStudents = new ArrayList<>(); // Creating arrayList String type for data storage.
        listOfStudents.add("Christine"); // Storing data in arrayList.
        listOfStudents.add("Duncan");
        listOfStudents.add("Anajana");
        listOfStudents.add("Deus Kanshabe");
        listOfStudents.add("Sheena A");
        listOfStudents.add("Murphy Laws");
        listOfStudents.add("Shaka John");
        listOfStudents.add("Optimus Prime");
        System.out.println("\nList of Students: " + listOfStudents); // Printing array list.

        // Using one filter()
        System.out.println("\nPrint list of student whose length is greater than 10");
        System.out.println("======================================================");
        listOfStudents.stream()
                .filter(s -> s.length() > 10)
                .forEach(System.out::println);
        System.out.println(" ");

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18, 20, 22); // Creating arrayList Int type for data storage.
        Integer lowestCommonMultiple = listOfNumbers.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 == 0)
                .findFirst().get(); // To find first number from filtered list.
        System.out.print("The first lowest LCM from the integer list is: " + lowestCommonMultiple + "\n");

        Stream<Integer> divisibleByThree = listOfNumbers.stream()
                .filter(x -> x % 2 != 0);
        System.out.println(divisibleByThree);


    }


}
