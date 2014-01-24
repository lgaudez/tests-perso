package com.sprsec.service;

import org.springframework.transaction.annotation.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprsec.dao.UserDAO;
import com.sprsec.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	public User getUserbyLogin(String login) {
		return userDAO.getUserbyLogin(login);
	}

    @Override
    public User getUserbyId(long id) {
        return userDAO.getUserbyId(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
