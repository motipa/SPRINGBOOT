package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.QuestionBank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuestionBankRepository extends CrudRepository<QuestionBank, Long>{
}
