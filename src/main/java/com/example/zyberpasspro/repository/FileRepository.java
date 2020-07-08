package com.example.zyberpasspro.repository;

import com.example.zyberpasspro.model.Files;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FileRepository extends CrudRepository<Files, Long> {
}