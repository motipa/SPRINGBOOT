package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.QuestionBank;
import com.example.zyberpasspro.repository.QuestionBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionBankService  implements IQuestionBankService{
    @Autowired
    private QuestionBankRepository questionBankRepository;
    @Override
    public List<QuestionBank> findAll() {
        return (List<QuestionBank>) questionBankRepository.findAll();
    }

    @Override
    public QuestionBank createQuestionBank(QuestionBank questionBank) {
      return  questionBankRepository.save(questionBank);
    }

    @Override
    public QuestionBank updateQuestionBank(QuestionBank questionBank, Long l) {
        return null;
    }

    @Override
    public QuestionBank getQuestion(Long l) {
       return  questionBankRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteQuestion(Long l) {
         questionBankRepository.deleteById(l);
         return l;
    }
}
