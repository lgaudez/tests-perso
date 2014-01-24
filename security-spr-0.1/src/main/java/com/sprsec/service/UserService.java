package com.sprsec.service;

import com.sprsec.model.User;

import java.util.List;

public interface UserService {
	
	public User getUserbyLogin(String login);

    public User getUserbyId(long id);

    public List<User> findAll();

    public void createUser(User user);

    public void deleteUserbyId(long id);
}
