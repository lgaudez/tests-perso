package com.sprsec.dao;

import com.sprsec.model.User;

import java.util.List;

public interface UserDAO {
	
	public User getUserbyLogin(String login);

    public User getUserbyId(long id);

    public List<User> findAll();

    public void createUser(User user);

    public void deleteUserbyId(long id);

}
