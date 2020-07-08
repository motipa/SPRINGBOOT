package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Title;
import com.example.zyberpasspro.service.ITitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/title")
public class TitleController {
@Autowired
    private ITitleService titleService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Title> getAllUsers() {
        // This returns a JSON or XML with the users
        return titleService.findAll();
    }
    @PostMapping(path="/add")
    public @ResponseBody
    Title CreateTitle(@RequestBody Title title) {
        // This returns a JSON or XML with the users
        return titleService.createTitle(title);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Title replaceTitle(@RequestBody Title title, @PathVariable Long id) {


        return  titleService.updateTitle(title,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Title one(@PathVariable Long id) {

        return  titleService.getTitle(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteTitle(@PathVariable Long id) {

        return  titleService.deleteTitle(id);
    }
}
