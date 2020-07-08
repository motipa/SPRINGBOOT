package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Admin;
import com.example.zyberpasspro.model.ExamPurchase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface ExamPurchaseRepository extends CrudRepository<ExamPurchase, Long> {
}
