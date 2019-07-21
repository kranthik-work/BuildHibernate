package com.kkalletla.hibernate;

import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Application {

    public static void main(String[] args) {

        System.out.println("Hello world");
        Session session = HibernateUtility.getSessionFactory().openSession();

        /*session.beginTransaction();
        User user = new User(6,"Kranthi Kiran Kalletla", 10,100);
        session.save(user);
        session.getTransaction().commit();

        session.beginTransaction();
        User retrievedUser = (User) session.get(User.class,2);
        System.out.println(retrievedUser);


        session.getTransaction().commit();*/

        session.beginTransaction();

        User user = new User();
        user.setName("Kranthi");

        ProteinData[] proteinData = {new ProteinData(10,100), new ProteinData(20,200)};
        user.setProteinData(proteinData);

        session.save(user);
        session.getTransaction().commit();
        session.close();
        HibernateUtility.getSessionFactory().close();
        System.out.println(user);
    }
}
