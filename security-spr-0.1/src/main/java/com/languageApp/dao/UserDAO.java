package com.languageApp.dao;

import com.languageApp.model.User;

import java.util.List;

public interface UserDAO {
	
	public User getUserbyLogin(String login);

    public User getUserbyId(Integer id);

    public List<User> findAll();

    public void createUser(User user);

    public void deleteUserbyId(Integer id);

}
