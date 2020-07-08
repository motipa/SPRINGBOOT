package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Stat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface StatRepository extends CrudRepository<Stat, Long> {
}
