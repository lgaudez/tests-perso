package com.springapp.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by leoG on 23/01/14.
 */

@Repository
public class UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * @Transactional annotation below will trigger Spring Hibernate transaction manager to automatically create
     * a hibernate session. See src/main/webapp/WEB-INF/servlet-context.xml
     */
    @Transactional
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List users = session.createQuery("from User").list();
        return users;
    }
}
