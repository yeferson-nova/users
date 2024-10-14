package com.ynova.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynova.users.dao.IRoleDao;
import com.ynova.users.models.Role;

@Service
public class RoleService {
    @Autowired
    private IRoleDao roleDao;

    public List<Role> getAll() {
        return roleDao.getAll();

    }

    public Role getId(long id) {
        return roleDao.getId(id);
    }

    public Role newRole(Role role) {
        return roleDao.newRole(role);
    }

    public Role updateRole(Role role) {
        return roleDao.updateRole(role);
    }

    public void deleteRole(long id) {
        roleDao.deleteRoleById(id);
    }

}
