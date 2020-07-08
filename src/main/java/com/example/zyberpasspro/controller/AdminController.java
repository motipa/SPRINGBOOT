package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.repository.AdminRepository;
import com.example.zyberpasspro.model.Admin;
import com.example.zyberpasspro.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController // This means that this class is a Controller
@RequestMapping(path="/admin")
public class AdminController {

    private final AdminRepository repository;
    @Autowired
    private IAdminService _adminService;

    public AdminController(AdminRepository repository,IAdminService adminService) {
        this.repository = repository;
        _adminService=adminService;
    }
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String username
            , @RequestParam String password) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Admin n = new Admin();
        n.setUsername(username);
        n.setPassword(password);
        repository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Admin> getAllUsers() {
        // This returns a JSON or XML with the users
        return _adminService.findAll();
    }
}

