package com.example.zyberpasspro.controller;
import com.example.zyberpasspro.model.Answer;

import com.example.zyberpasspro.service.AnswerService;

import com.example.zyberpasspro.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController  // This means that this class is a Controller
@RequestMapping(path="/answer")
public class AnswerController {
    @Autowired
    private IAnswerService answerService;


    @PostMapping(path="/add")
    public @ResponseBody Answer CreateAnswer(@RequestBody Answer answer) {
        // This returns a JSON or XML with the users
        return answerService.createAnswer(answer);
    }
    @PutMapping("/update/{id}")
   public @ResponseBody Answer replaceAnswer(@RequestBody Answer answer, @PathVariable Long id) {

         return  answerService.updateAnswer(answer,id );
      }
    @GetMapping("/{id}")
   public  @ResponseBody Answer one(@PathVariable Long id) {

        return  answerService.getAnswer(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteAnswer(@PathVariable Long id) {

        return  answerService.deleteAnswer(id);
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Answer> getAllUsers() {
        // This returns a JSON or XML with the users
        return answerService.findAll();
    }
}
