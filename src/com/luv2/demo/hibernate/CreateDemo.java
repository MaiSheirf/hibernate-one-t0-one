package com.luv2.demo.hibernate;

import com.luv2.hibernate.demo.entity.instructor;
import com.luv2.hibernate.demo.entity.instructorDetail;
import com.luv2.hibernate.demo.entity.student;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class CreateDemo {
    public static void main(String[] args){
        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(com.luv2.hibernate.demo.entity.instructor.class)
                .addAnnotatedClass(com.luv2.hibernate.demo.entity.instructorDetail.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();
        
        try {
            //create  object
            com.luv2.hibernate.demo.entity.instructor tempStudent =
                    new instructor("mai","sherif","mai122001");

            com.luv2.hibernate.demo.entity.instructorDetail tempStudentDetail =
                    new instructorDetail("tube","hoppy");

            //associate objects
            tempStudent.setInsDetail(tempStudentDetail);
            //start a transaction
            session.beginTransaction();
            //save the  object
            //also will save tempStudentDetail
            session.save(tempStudent);
            //commit a transaction
            session.getTransaction().commit();
        }
        finally{
            factory.close();
        }
    }
}
