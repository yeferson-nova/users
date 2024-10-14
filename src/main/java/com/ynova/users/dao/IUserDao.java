package com.ynova.users.dao;

import java.util.List;
import com.ynova.users.models.User;

public interface IUserDao {

    List<User> getAll();

    User getId(long id);

    User newUser(User user);

    User updateUser(User user);

    void deleteUserById(long id);
}
