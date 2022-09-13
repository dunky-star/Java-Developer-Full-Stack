package com.dunky.hibernate;
import com.dunky.hibernate.dao.InstructorDao;
import com.dunky.hibernate.entity.Instructor;
import com.dunky.hibernate.entity.InstructorDetail;

public class MyApp {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Geoffrey", "Kaligs", "dunkygeoffrey39@gmail.com");
		InstructorDetail instructorDetail = new InstructorDetail("https://www.youtube.com/watch?v=_Sudb6Z97O8", "WRC Safari Kenya");
		
		 // associate the objects
        instructorDetail.setInstructor(instructor);
        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        // when you get instructorDetail then hibernate also saves instructor info
        InstructorDao instructorDao = new InstructorDao();
        instructorDao.saveInstructor(instructor);
                
        		
	}

}
