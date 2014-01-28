package com.languageApp.service;

import org.springframework.transaction.annotation.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.languageApp.dao.UserDAO;
import com.languageApp.model.User;

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
    public User getUserbyId(Integer id) {
        return userDAO.getUserbyId(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void deleteUserbyId(Integer id) {
        userDAO.deleteUserbyId(id);
    }
}
