package com.example.zyberpasspro.repository;

import com.example.zyberpasspro.model.Admin;
import com.example.zyberpasspro.model.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
