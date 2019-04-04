package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    Iterable<User> getAllUsers();
    void deleteUser(Long id);
}
