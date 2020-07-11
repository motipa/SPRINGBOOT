package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.UserApp;


import java.util.List;

public interface IUserService {
    List<UserApp> findAll();
    public UserApp createUser(UserApp user);
    public UserApp updateUser(UserApp user, Long l);
    public UserApp getUser(Long l);
    public Long deleteUser(Long l);
}
