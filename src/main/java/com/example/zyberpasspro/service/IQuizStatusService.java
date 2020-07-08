package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.QuizStatus;

import java.util.List;

public interface IQuizStatusService {

    List<QuizStatus> findAll();
    public QuizStatus createQuizStatus(QuizStatus quizStatus);
    public QuizStatus updateQuizStatus(QuizStatus quizStatus, Long l);
    public QuizStatus getQuizStatus(Long l);
    public Long deleteQuizStatus(Long l);

}
