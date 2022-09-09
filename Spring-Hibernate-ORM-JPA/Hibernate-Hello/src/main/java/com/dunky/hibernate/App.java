package com.dunky.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dunky.hibernate.entity.Student;
import com.dunky.hibernate.util.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Student student1 = new Student("Kaligs", "Duncan", "kaligs@yo.com");
        Student student2 = new Student("Chris", "Cena", "chri@yo.com");
        Student student3 = new Student("Theodore", "Maxis", "xax@yo.com");
        Student student4 = new Student("Pop", "Star", "pop@yo.com");
        
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(student1);
            session.save(student2);
            session.save(student3);
            session.save(student4);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List < Student > students = session.createQuery("from Student", Student.class).list();
            students.forEach(s -> System.out.println(s.getFirstName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
