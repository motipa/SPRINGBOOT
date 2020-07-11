package com.example.zyberpasspro.repository;

import com.example.zyberpasspro.model.UserApp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;


public interface UserRepository extends CrudRepository<UserApp, Long> {

    @Query("SELECT t.emailid FROM Register t where t.emailid = :username")
    public UserDetails getUser(String username);
}
