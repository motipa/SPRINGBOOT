package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Report;

import java.util.List;

public interface IReportService {

    List<Report> findAll();
    public Report createReport(Report report);
    public Report updateReport(Report report, Long l);
    public Report getReport(Long l);
    public Long deleteReport(Long l);
}
