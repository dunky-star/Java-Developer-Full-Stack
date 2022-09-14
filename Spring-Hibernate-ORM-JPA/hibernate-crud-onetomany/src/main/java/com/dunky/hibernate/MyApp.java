package com.dunky.hibernate;

import com.dunky.hibernate.dao.CourseDao;
import com.dunky.hibernate.dao.InstructorDao;
import com.dunky.hibernate.entity.Course;
import com.dunky.hibernate.entity.Instructor;

public class MyApp {
    public static void main(String[] args) {

        InstructorDao instructorDao = new InstructorDao();
        CourseDao courseDao = new CourseDao();

        Instructor instructor = new Instructor("Kalig", "Dunky", "yocare@yohunters.com");
        instructorDao.saveInstructor(instructor);

        // create some courses
        Course tempCourse1 = new Course("Full Stack Java - SimpliLearn Bootcamp");
        tempCourse1.setInstructor(instructor);
        courseDao.saveCourse(tempCourse1);

        Course tempCourse2 = new Course("The PHP Developer Masterclass");
        tempCourse2.setInstructor(instructor);
        courseDao.saveCourse(tempCourse2);
    }
}