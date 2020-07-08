package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.repository.ExamPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.example.zyberpasspro.model.ExamPurchase;
import java.util.List;
@Service
public class ExamPurchaseService implements IExamPurchaseService {
    @Autowired
    private ExamPurchaseRepository examPurchaseRepository;
    @Override
    public List<com.example.zyberpasspro.model.ExamPurchase> findAll() {
        return (List<ExamPurchase>) examPurchaseRepository.findAll();
    }

    @Override
    public ExamPurchase createExamPurchase(ExamPurchase examPurchase) {
        return examPurchaseRepository.save(examPurchase);
    }

    @Override
    public ExamPurchase updateExamPurchase(ExamPurchase examPurchase, Long l) {
        return null;
    }

    @Override
    public ExamPurchase getExamPurchase(Long l) {
        return examPurchaseRepository.findById(l)
                .orElseThrow(() -> new AdminNotFoundException(l));
    }

    @Override
    public Long deleteExamPurchase(Long l) {
        examPurchaseRepository.deleteById(l);
        return l;
    }
}
