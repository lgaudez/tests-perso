package com.springapp.dao;

import com.springapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leoG on 23/01/14.
 */
public interface UserDaoI {

    void save(User user);
    void update(User user);
    void delete(User user);
    User findByName(String lastName);
    List<User> findAll() ;

}
