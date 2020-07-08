package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.QuestionBank;
import com.example.zyberpasspro.service.IQuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/question-bank")
public class QuestionBankController {
   @Autowired
   private IQuestionBankService questionBankService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<QuestionBank> getAllUsers() {
        // This returns a JSON or XML with the users
        return questionBankService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    QuestionBank CreateQBank(@RequestBody QuestionBank questionBank) {
        // This returns a JSON or XML with the users
        return questionBankService.createQuestionBank(questionBank);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody QuestionBank replaceQBank(@RequestBody QuestionBank questionBank, @PathVariable Long id) {

        return  questionBankService.updateQuestionBank(questionBank,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody QuestionBank one(@PathVariable Long id) {

        return  questionBankService.getQuestion(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteQuestionBank(@PathVariable Long id) {


        return  questionBankService.deleteQuestion(id);
    }
}
