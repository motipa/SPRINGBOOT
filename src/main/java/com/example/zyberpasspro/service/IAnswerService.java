package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Admin;
import com.example.zyberpasspro.model.Answer;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IAnswerService {
    List<Answer> findAll();
    public Answer createAnswer(Answer answer);
    public Answer updateAnswer(Answer answer, Long l);
    public Answer getAnswer(Long l);
    public Long deleteAnswer(Long l);
 }
