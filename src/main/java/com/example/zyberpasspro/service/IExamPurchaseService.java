package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Content;
import com.example.zyberpasspro.model.ExamPurchase;

import java.util.List;

public interface IExamPurchaseService {

    List<ExamPurchase> findAll();
    public ExamPurchase createExamPurchase(ExamPurchase examPurchase);
    public ExamPurchase updateExamPurchase(ExamPurchase examPurchase, Long l);
    public ExamPurchase getExamPurchase(Long l);
    public Long deleteExamPurchase(Long l);
}
