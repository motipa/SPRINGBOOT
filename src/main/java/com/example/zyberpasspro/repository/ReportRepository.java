package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReportRepository extends CrudRepository<Report, Long> {
}
