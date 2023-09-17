package com.max.jwt.db.user.service.impl;

import com.max.jwt.db.user.model.User;
import com.max.jwt.db.user.repository.UserRepository;
import com.max.jwt.db.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final String USER = "USER";
    private static final String ADMIN = "ADMIN";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;

    public UserServiceImpl() {}

    @Override
    public User createUser(String username, String password) {
        return userRepository.save(
                new User(username, encoder.encode(password), List.of(USER))
        );
    }

    @Override
    public User createAdmin(String username, String password) {
        return userRepository.save(
                new User(username, encoder.encode(password), List.of(USER, ADMIN))
        );
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

}
