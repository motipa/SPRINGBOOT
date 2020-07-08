package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Content;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.service.IExamPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/exam-purchase")
public class ExamPurchaseController {
@Autowired
    private IExamPurchaseService iExamPurchaseService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<ExamPurchase> getAllUsers() {
        // This returns a JSON or XML with the users
        return iExamPurchaseService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    ExamPurchase CreateExampurchase(@RequestBody ExamPurchase examPurchase) {
        // This returns a JSON or XML with the users
        return iExamPurchaseService.createExamPurchase(examPurchase);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody ExamPurchase replaceAnswer(@RequestBody ExamPurchase examPurchase, @PathVariable Long id) {

        return  iExamPurchaseService.updateExamPurchase(examPurchase,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody ExamPurchase one(@PathVariable Long id) {

        return  iExamPurchaseService.getExamPurchase(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteExamPurchase(@PathVariable Long id) {

        return  iExamPurchaseService.deleteExamPurchase(id);
    }
}
