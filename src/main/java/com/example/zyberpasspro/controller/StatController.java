package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Stat;
import com.example.zyberpasspro.service.IStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/stat")
public class StatController {

@Autowired
    private IStatService statService;
    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Stat> getAllUsers() {
        // This returns a JSON or XML with the users
        return statService.findAll();
    }


    @PostMapping(path="/add")
    public @ResponseBody
    Stat CreateStat(@RequestBody Stat stat) {
        // This returns a JSON or XML with the users
        return statService.createStat(stat);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Stat replaceStat(@RequestBody Stat stat, @PathVariable Long id) {

        return  statService.updateStat(stat,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Stat one(@PathVariable Long id) {

        return  statService.getStat(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteStat(@PathVariable Long id) {

        return  statService.deleteStat(id);
    }
}
