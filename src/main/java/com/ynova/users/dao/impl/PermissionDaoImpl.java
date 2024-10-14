package com.ynova.users.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ynova.users.dao.IPermissionnDao;
import com.ynova.users.models.Permissionn;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;

@Repository
public class PermissionDaoImpl implements IPermissionnDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public List<Permissionn> getAll() {
        return entityManager.createNamedQuery("Permission.findAll", Permissionn.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Permissionn getId(long id) {
        return entityManager.find(Permissionn.class, id);

    }

    @Override
    @Transactional
    public Permissionn newPermissionn(Permissionn permissionn) {
        entityManager.persist(permissionn);
        return permissionn;
    }

    @Override
    @Transactional
    public Permissionn updatePermissionn(Permissionn permissionn) {
        return entityManager.merge(permissionn);
    }

    @Override
    @Transactional
    public void deletePermissionnById(long id) {
        Permissionn permissionn = getId(id);
        if (permissionn != null) {
            entityManager.remove(permissionn);
        } else {
            throw new EntityNotFoundException("Permission not found with id: " + id);
        }
    }
}
