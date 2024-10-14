package com.ynova.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynova.users.models.Role;
import com.ynova.users.services.RoleService;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping({ "", "/" })
    public List<Role> getAll() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public Role getId(@PathVariable long id) {
        return roleService.getId(id);
    }

    @PostMapping("/")
    public Role newRole(@RequestBody Role role) {
        return roleService.newRole(role);
    }

    @PutMapping("/{id}")
    public Role updateRole(@RequestBody Role role) {
        return roleService.updateRole(role);
    }

    @DeleteMapping("/{id}")
    public void deleteUSer(@PathVariable long id) {
        roleService.deleteRole(id);
    }

}
