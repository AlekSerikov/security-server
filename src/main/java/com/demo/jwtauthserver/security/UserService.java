package com.demo.jwtauthserver.security;



import com.demo.jwtauthserver.model.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserByLogin(String login);
}