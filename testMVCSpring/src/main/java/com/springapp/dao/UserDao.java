package com.springapp.dao;

import com.springapp.model.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by leoG on 23/01/14.
 */
public class UserDao extends HibernateDaoSupport implements UserDaoI{

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
                "from user where lastName=?",lastName
        );
        return (User)list.get(0);
    }
}
