package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.SubCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategory,Long> {
}
