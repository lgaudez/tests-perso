package com.springapp.bo;

import com.springapp.model.User;

/**
 * Created by leoG on 23/01/14.
 */
public interface UserBoI {

    void save(User user);
    void update(User user);
    void delete(User user);
    User findByName(String lastName);
}
