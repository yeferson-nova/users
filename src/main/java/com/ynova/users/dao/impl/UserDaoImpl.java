package com.ynova.users.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ynova.users.dao.IUserDao;
import com.ynova.users.models.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements IUserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return entityManager.createNamedQuery("User.findAll", User.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public User getId(long id) {
        return entityManager.find(User.class, id);

    }

    @Override
    @Transactional
    public User newUser(User user) {
        return entityManager.merge(user);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        return entityManager.merge(user);
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        User user = getId(id);
        entityManager.remove(user);
    }
}
