package com.ynova.users.dao;

import java.util.List;

import com.ynova.users.models.Permissionn;

public interface IPermissionnDao {

    List<Permissionn> getAll();

    Permissionn getId(long id);

    Permissionn newPermissionn(Permissionn permissionn);

    Permissionn updatePermissionn(Permissionn permissionn);

    void deletePermissionnById(long id);

}
