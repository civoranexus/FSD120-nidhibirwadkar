package com.society360.backend.service;

import com.society360.backend.model.User;
import com.society360.backend.repository.UserRepository;
import java.util.List;

public class UserService {

    private final UserRepository repository = new UserRepository();

    public List<User> getAllUsers() {
        return repository.findAllUsers();
    }
}

