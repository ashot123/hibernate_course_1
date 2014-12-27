package org.javabrains.koushik;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.javabrains.koushik.dto.UserDetails;

import java.util.Date;

/**
 * Created by Ashot Karakhanyan on 27-12-2014
 */
public class HibernateTest {

    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setUserId(1);
        user.setUserName("First User");
        user.setAddress("First user's address");
        user.setJoinedDate(new Date());
        user.setDescription("Just description Just description Just description Just description Just description Just description" +
                "Just description Just description Just description Just description Just description Just description Just description" +
                "Just descriptionJust description Just description Just description Just description Just description Just description " +
                "Just description Just description Just description Just description Just description Just description Just description" +
                "Just descriptionJust description Just description Just description Just description Just description Just description " +
                "Just description Just description Just description Just description Just description Just description Just description" +
                "Just descriptionJust description Just description Just description Just description Just description Just description " +
                "Just description Just description Just description Just description Just description Just description Just description" +
                "Just descriptionJust description Just description Just description Just description Just description Just description " +
                "Just description Just description Just description Just description Just description ");

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }
}
