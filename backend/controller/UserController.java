package backend.controller;

import backend.service.UserService;

public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String getUsers() {
        return userService.getAllUsers();
    }
}



