package com.example.zyberpasspro.repository;


import com.example.zyberpasspro.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {


}

