package com.ynova.users.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ynova.users.dao.IRoleDao;
import com.ynova.users.models.Role;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class RoleDaoImpl implements IRoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Role> getAll() {
        return entityManager.createNamedQuery("Role.findAll", Role.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Role getId(long id) {
        return entityManager.find(Role.class, id);

    }

    @Override
    @Transactional
    public Role newRole(Role role) {
        return entityManager.merge(role);
    }

    @Override
    @Transactional
    public Role updateRole(Role role) {
        return entityManager.merge(role);
    }

    @Override
    @Transactional
    public void deleteRoleById(long id) {
        Role role = getId(id);
        entityManager.remove(role);
    }
}
