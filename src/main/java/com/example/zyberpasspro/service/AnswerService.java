package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Admin;
import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.repository.AdminRepository;
import com.example.zyberpasspro.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswerService implements IAnswerService {
    @Autowired
    private AnswerRepository repository;
    @Override
    public List<Answer> findAll() {
        return (List<Answer>) repository.findAll();
    }

    @Override
    public Answer createAnswer(Answer answer) {
        return repository.save(answer);

    }

    @Override
    public Answer updateAnswer(Answer answer, Long l) {

        return repository.findById(l)
                .map(answer1 -> {
                    answer1.setAnswer(answer.getAnswer());
                    answer1.setQuizid(answer.getQuizid());
                    return repository.save(answer1);
                })
                .orElseGet(() -> {
                    answer.setId(l);
                    return repository.save(answer);
                });

    }

    @Override
    public Answer getAnswer(Long l) {
        return repository.findById(l)
                .orElseThrow(() -> new AdminNotFoundException(l));
    }

    @Override
    public Long   deleteAnswer(Long l) {
         repository.deleteById(l);
         return l;


    }
}
