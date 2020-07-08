package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.QuizStatus;
import com.example.zyberpasspro.service.IQuestionBankService;
import com.example.zyberpasspro.service.IQuizStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/quiz-status")
public class QuizStatusController {
     @Autowired
     private IQuizStatusService quizStatusService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<QuizStatus> getAllUsers() {
        // This returns a JSON or XML with the users
        return quizStatusService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    QuizStatus CreateQuiz(@RequestBody QuizStatus quizStatus) {
        // This returns a JSON or XML with the users
        return quizStatusService.createQuizStatus(quizStatus);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody QuizStatus replaceQuiz(@RequestBody QuizStatus quizStatus, @PathVariable Long id) {

        return  quizStatusService.updateQuizStatus(quizStatus,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody QuizStatus one(@PathVariable Long id) {

        return  quizStatusService.getQuizStatus(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteQuizStatus(@PathVariable Long id) {

        return  quizStatusService.deleteQuizStatus(id);
    }
}
