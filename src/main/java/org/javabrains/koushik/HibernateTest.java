package org.javabrains.koushik;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import org.javabrains.koushik.dto.Address;
import org.javabrains.koushik.dto.UserDetails;

import java.util.Date;

/**
 * Created by Ashot Karakhanyan on 27-12-2014
 */
public class HibernateTest {

    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setUserName("First User");

        Address address = new Address();
        address.setStreet("Street name");
        address.setCity("City name");
        user.setAddress(address);

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

    }
}
