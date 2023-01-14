package com.dunky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Class 1
// A class to represent a Student
class Student {

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name, String address)
    {

        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString()
    {

        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
                + this.address;
    }
}

// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {

        return a.rollno - b.rollno;
    }
}

// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {

        return a.name.compareTo(b.name);
    }
}

// Class 4
// Main class
public class ComparatorJava {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of Student type
        ArrayList<Student> listStudent = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        listStudent.add(new Student(111, "Mayank", "london"));
        listStudent.add(new Student(131, "Anshul", "nyc"));
        listStudent.add(new Student(121, "Solanki", "jaipur"));
        listStudent.add(new Student(101, "Aggarwal", "Hongkong"));
        listStudent.add(new Student(1001, "Duncan", "Kampala"));
        listStudent.add(new Student(600, "Soyinka", "Kigali"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < listStudent.size(); i++)
            System.out.println(listStudent.get(i));

        // Sorting student entries by roll number
        Collections.sort(listStudent, new Sortbyroll());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < listStudent.size(); i++)
            System.out.println(listStudent.get(i));

        // Sorting student entries by name
        Collections.sort(listStudent, new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < listStudent.size(); i++)
            System.out.println(listStudent.get(i));
    }
}

