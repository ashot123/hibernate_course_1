package org.javabrains.koushik;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
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
        user.setDescription("Just description ");

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

        user = null;
        session = sessionFactory.openSession();
        session.beginTransaction();
        user = (UserDetails) session.get(UserDetails.class, 1);

        System.out.println("user = " + user);

    }
}
