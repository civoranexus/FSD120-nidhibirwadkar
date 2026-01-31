package com.society360.backend.service;

import com.society360.backend.model.User;
import com.society360.backend.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUsers() {
    return List.of(
        new User(1, "Nidhi", "nidhi@gmail.com", "Admin"),
        new User(2, "Amit", "amit@gmail.com", "Resident"),
        new User(3, "Sneha", "sneha@gmail.com", "Resident")
    );
}

}

