package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Schedule;

import java.util.List;

public interface IScheduleService {
    List<Schedule> findAll();
    public Schedule createSchedule(Schedule schedule);
    public Schedule updateSchedule(Schedule schedule, Long l);
    public Schedule getSchecule(Long l);
    public Long deleteSchedule(Long l);
}
