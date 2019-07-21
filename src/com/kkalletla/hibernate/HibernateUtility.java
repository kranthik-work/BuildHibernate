package com.kkalletla.hibernate;

import org.hibernate.HibernateError;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtility {

    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    static {
        try {

            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
            }
            catch (HibernateError e){
                System.out.println("Error while creating session");
        }
    }

    public HibernateUtility() {

    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
