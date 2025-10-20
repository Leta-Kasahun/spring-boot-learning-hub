package com.example.library.service;

import com.example.library.repository.UserRepository;
import com.example.demo.userManagment.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register a new user
    public User register(User user) {
        if (userRepository.findByEmail(user.getEamil()) != null) {
            throw new RuntimeException("Email already registered!");
        }
        return userRepository.save(user);
    }

    // Login user
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user == null || !user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid email or password!");
        }
        return user;
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
