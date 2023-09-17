package com.max.jwt.login.service;

import com.max.jwt.login.models.LoginRequest;

public interface LoginService {

    String login(LoginRequest request);

}
