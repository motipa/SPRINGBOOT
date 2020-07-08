package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TitleRepository extends CrudRepository<Title,Long> {
}
