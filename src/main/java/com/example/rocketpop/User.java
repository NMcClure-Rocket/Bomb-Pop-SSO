package com.example.rocketpop;

import org.springframework.security.crypto.password.PasswordEncoder;

// User class used to check if the password given is valid

public class User {
    private final String passwordHash;   

    public User(String password, PasswordEncoder encoder) {

        this.passwordHash = encoder.encode(password);
    }

    public boolean checkPassword(String rawPassword, PasswordEncoder encoder) {
        return encoder.matches(rawPassword, this.passwordHash);
    }

}