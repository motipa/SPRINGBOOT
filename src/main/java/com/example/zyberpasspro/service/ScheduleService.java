package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Schedule;
import com.example.zyberpasspro.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleService implements IScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;
    @Override
    public List<Schedule> findAll() {
        return (List<Schedule>) scheduleRepository.findAll();
    }

    @Override
    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public Schedule updateSchedule(Schedule schedule, Long l) {
        return null;
    }

    @Override
    public Schedule getSchecule(Long l) {
        return scheduleRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteSchedule(Long l) {
        scheduleRepository.deleteById(l);
        return l;
    }
}
