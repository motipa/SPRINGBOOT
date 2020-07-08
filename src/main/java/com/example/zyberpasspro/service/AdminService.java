package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Admin;
import com.example.zyberpasspro.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements  IAdminService {
    @Autowired
    private AdminRepository repository;

    @Override
    public List<Admin> findAll() {

        return (List<Admin>) repository.findAll();
    }
}
