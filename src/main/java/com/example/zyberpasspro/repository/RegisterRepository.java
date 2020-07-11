package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Register;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
@Repository
public interface RegisterRepository extends CrudRepository<Register, Long> {

    @Query("SELECT t.emailid FROM Register t where t.emailid = :username")
    public UserDetails getUser(String username);
}
