package com.srik.userservice.services;

import com.srik.userservice.models.Token;
import com.srik.userservice.models.User;

public interface UserService {
    public User signup(String name, String email, String password);
    public Token login(String email, String password);
    public User validate(String token);
    public void logout(String token);
}
