package com.ynova.users.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynova.users.dao.IUserDao;
import com.ynova.users.models.User;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();

    }

    public User getId(long id) {
        return userDao.getId(id);
    }

    public User newUser(User user) {
        return userDao.newUser(user);
    }

    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    public void deleteUSer(long id) {
        userDao.deleteUserById(id);
    }

}
