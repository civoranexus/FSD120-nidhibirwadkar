package com.society360.backend.controller;

import com.society360.backend.model.User;
import com.society360.backend.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService service = new UserService();

    @GetMapping("/users")
    public List<User> getUsers() {
        return service.getAllUsers();
    }
}
