package com.example.zyberpasspro.repository;
import com.example.zyberpasspro.model.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
}
