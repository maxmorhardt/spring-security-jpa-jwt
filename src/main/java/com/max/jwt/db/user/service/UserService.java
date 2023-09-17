package com.max.jwt.db.user.service;

import com.max.jwt.db.user.model.User;

public interface UserService {

    User createUser(String username, String password);

    User createAdmin(String username, String password);

    User findUserByUsername(String username);

}
