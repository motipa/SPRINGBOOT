package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.QuestionBank;

import java.util.List;

public interface IQuestionBankService {

    List<QuestionBank> findAll();
    public QuestionBank createQuestionBank(QuestionBank questionBank);
    public QuestionBank updateQuestionBank(QuestionBank questionBank, Long l);
    public QuestionBank getQuestion(Long l);
    public Long deleteQuestion(Long l);
}
