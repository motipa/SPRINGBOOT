package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Register;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RegisterRepository extends CrudRepository<Register, Long> {
}
