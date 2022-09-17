package com.dunky.hibernate;

import org.hibernate.Session;

import com.dunky.hibernate.entity.Employee;
import com.dunky.hibernate.entity.Project;
import com.dunky.hibernate.util.HibernateUtil;

public class MyApp {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Create an employee
        Employee employee = new Employee();
        employee.setFirstName("Lamar");
        employee.setLastName("Argy");

       // Create project1
        Project project1 = new Project();
        project1.setTitle("Packet Core Expansion Phase I");

        // Create project2
        Project project2 = new Project();
        project2.setTitle("Java Metaverse Market");
       
       // Create project3
       Project project3 = new Project();
       project3.setTitle("Yo Metaverse Game Simulation");

       // employee can work on two projects, Add project references in the employee
       employee.getProjects().add(project1);
       employee.getProjects().add(project2);
       employee.getProjects().add(project3);

        // Add employee reference in the projects
       project1.getEmployees().add(employee);
       project2.getEmployees().add(employee);
       project3.getEmployees().add(employee);

       session.save(employee);

       session.getTransaction().commit();
       HibernateUtil.shutdown();
    }



}
