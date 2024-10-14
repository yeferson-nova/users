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
import com.ynova.users.models.Permissionn;
import com.ynova.users.services.PermissionnService;

@RestController
@RequestMapping("permission")
public class PermissionnnController {

    @Autowired
    PermissionnService permissionnService;

    @GetMapping({ "", "/" })
    public List<Permissionn> getAll() {
        return permissionnService.getAll();
    }

    @GetMapping("/{id}")
    public Permissionn getId(@PathVariable long id) {
        return permissionnService.getId(id);
    }

    @PostMapping("/")
    public Permissionn newPermissionn(@RequestBody Permissionn permissionn) {
        return permissionnService.newPermission(permissionn);
    }

    @PutMapping("/{id}")
    public Permissionn updatePermissionn(@RequestBody Permissionn permission) {
        return permissionnService.updatePermission(permission);
    }

    @DeleteMapping("/{id}")
    public void deleteUSer(@PathVariable long id) {
        permissionnService.deleteUSer(id);
    }

}
