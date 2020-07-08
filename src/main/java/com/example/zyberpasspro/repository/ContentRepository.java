package com.example.zyberpasspro.repository;

import com.example.zyberpasspro.model.Content;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContentRepository extends CrudRepository<Content, Long> {
}
