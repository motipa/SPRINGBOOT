package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.UserApp;
import com.example.zyberpasspro.repository.UserRepository;
import com.example.zyberpasspro.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/user", method = RequestMethod.GET)
    public List listUser(){
        return (List) userService.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public UserApp create(@RequestBody UserApp user){
        return userService.createUser(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
        userService.deleteUser(id);
        return "success";
    }

}
