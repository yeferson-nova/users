package com.ynova.users.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ynova.users.models.User;
import com.ynova.users.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({ "", "/" })
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getId(@PathVariable long id) {
        return userService.getId(id);
    }

    @PostMapping("/")
    public User newUser(@RequestBody User user) {
        return userService.newUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUSer(@PathVariable long id) {
        userService.deleteUSer(id);
    }

}
