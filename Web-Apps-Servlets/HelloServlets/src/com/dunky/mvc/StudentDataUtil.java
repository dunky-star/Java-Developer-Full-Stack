package com.dunky.mvc;

import java.util.*;

// Helper class to allow us access the model.

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		// Create an empty Array List
		List<Student> students = new ArrayList<>();
		
		// Add sample data
		students.add(new Student("Duncan", "Opiyo", "yocare@yohunters.com"));
		students.add(new Student("Ahurire", "Sheena", "yocare@yohunters.com"));
		students.add(new Student("Deus", "Khan", "yocare@yohunters.com"));
		students.add(new Student("Florence", "Ajay", "yocare@yohunters.com"));
		
		// return the list to the calling program
		return students;
	}

}
