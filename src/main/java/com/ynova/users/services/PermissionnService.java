package com.ynova.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynova.users.dao.IPermissionnDao;
import com.ynova.users.models.Permissionn;

@Service
public class PermissionnService {

    @Autowired
    private IPermissionnDao permissionnDao;

    public List<Permissionn> getAll() {
        return permissionnDao.getAll();

    }

    public Permissionn getId(long id) {
        return permissionnDao.getId(id);
    }

    public Permissionn newPermission(Permissionn permissionn) {
        return permissionnDao.newPermissionn(permissionn);
    }

    public Permissionn updatePermission(Permissionn permissionn) {
        return permissionnDao.updatePermissionn(permissionn);
    }

    public void deleteUSer(long id) {
        permissionnDao.deletePermissionnById(id);
    }

}
