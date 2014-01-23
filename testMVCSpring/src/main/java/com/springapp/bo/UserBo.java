package com.springapp.bo;

import com.springapp.dao.UserDao;
import com.springapp.dao.UserDaoI;
import com.springapp.model.User;

/**
 * Created by leoG on 23/01/14.
 */
public class UserBo implements UserBoI{

    UserDaoI userDao;

    public void setUserDao(UserDaoI userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.save(user);
    }

    @Override
    public User findByName(String lastName) {
        return userDao.findByName(lastName);
    }
}
