package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Schedule;
import com.example.zyberpasspro.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/schedule")
public class ScheduleController {
  @Autowired
   private IScheduleService scheduleService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Schedule> getAllUsers() {
        // This returns a JSON or XML with the users
        return scheduleService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    Schedule CreateSchedule(@RequestBody Schedule schedule) {
        // This returns a JSON or XML with the users
        return scheduleService.createSchedule(schedule);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Schedule replaceSchedule(@RequestBody Schedule schedule, @PathVariable Long id) {

        return  scheduleService.updateSchedule(schedule,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Schedule one(@PathVariable Long id) {

        return  scheduleService.getSchecule(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteCategory(@PathVariable Long id) {

        return  scheduleService.deleteSchedule(id);
    }
}
