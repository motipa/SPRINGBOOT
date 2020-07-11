package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.UserApp;
import com.example.zyberpasspro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository repository;
    @Override
    public List<UserApp> findAll() {
        return (List<UserApp>) repository.findAll();
    }

    @Override
    public UserApp createUser(UserApp user) {
        return repository.save(user);
    }

    @Override
    public UserApp updateUser(UserApp user, Long l) {
        return null;
    }

    @Override
    public UserApp getUser(Long l) {
        return repository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteUser(Long l) {
        repository.deleteById(l);
        return l;
    }
}
