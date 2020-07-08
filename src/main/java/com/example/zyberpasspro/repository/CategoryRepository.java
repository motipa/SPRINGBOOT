package com.example.zyberpasspro.repository;

import com.example.zyberpasspro.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}

