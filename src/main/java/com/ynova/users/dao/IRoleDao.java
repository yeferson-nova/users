package com.ynova.users.dao;

import java.util.List;

import com.ynova.users.models.Role;

public interface IRoleDao {

    List<Role> getAll();

    Role getId(long id);

    Role newRole(Role user);

    Role updateRole(Role user);

    void deleteRoleById(long id);

}
