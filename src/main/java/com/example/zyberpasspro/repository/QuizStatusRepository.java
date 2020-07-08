package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.QuizStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuizStatusRepository extends CrudRepository<QuizStatus,Long> {
}
