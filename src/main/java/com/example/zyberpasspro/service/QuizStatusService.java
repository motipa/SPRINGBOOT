package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.QuizStatus;
import com.example.zyberpasspro.repository.QuizStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizStatusService implements IQuizStatusService {
    @Autowired
    private QuizStatusRepository quizStatusRepository;
    @Override
    public List<QuizStatus> findAll() {
        return (List<QuizStatus>) quizStatusRepository.findAll();
    }

    @Override
    public QuizStatus createQuizStatus(QuizStatus quizStatus) {
        return quizStatusRepository.save(quizStatus);
    }

    @Override
    public QuizStatus updateQuizStatus(QuizStatus quizStatus, Long l) {
        return null;
    }

    @Override
    public QuizStatus getQuizStatus(Long l) {
        return  quizStatusRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteQuizStatus(Long l) {
       quizStatusRepository.deleteById(l);
       return l;
    }
}
