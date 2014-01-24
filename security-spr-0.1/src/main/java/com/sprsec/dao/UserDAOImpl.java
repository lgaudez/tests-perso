package com.sprsec.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.sprsec.model.User;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session openSession() {
		return sessionFactory.getCurrentSession();
	}

	public User getUserbyLogin(String login) {
		List<User> userList = new ArrayList<User>();
		Query query = openSession().createQuery("from User u where u.login = :login");
		query.setParameter("login", login);
		userList = query.list();
		if (userList.size() > 0)
			return userList.get(0);
		else
			return null;	
	}

    @Transactional
    public List<User> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List users = session.createQuery("from User").list();
        return users;
    }

    public User getUserbyId(long id) {
        List<User> userList = new ArrayList<User>();
        Query query = openSession().createQuery("from User u where u.id = :id");
        query.setLong("id", id);
        userList = query.list();
        if (userList.size() > 0)
            return userList.get(0);
        else
            return null;
    }
}
