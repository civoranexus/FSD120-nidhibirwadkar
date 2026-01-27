package com.society360.backend.repository;

import com.society360.backend.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Nidhi", "nidhi@gmail.com", "Resident"));
        users.add(new User(2, "Admin", "admin@gmail.com", "Admin"));
        return users;
    }
}
