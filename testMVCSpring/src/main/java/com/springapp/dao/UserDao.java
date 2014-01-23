package com.springapp.dao;

import com.springapp.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by leoG on 23/01/14.
 */

@Repository
public class UserDao extends HibernateDaoSupport implements UserDaoI{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    @Override
    public void update(User user) {
        getHibernateTemplate().update(user);
    }

    @Override
    public void delete(User user) {
        getHibernateTemplate().delete(user);
    }

    @Override
    public User findByName(String lastName) {
        List list = getHibernateTemplate().find(
                "from User where lastName=?",lastName
        );
        return (User)list.get(0);
    }

    @Transactional
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List users = session.createQuery("from User ").list();
        return users;
    }
}
