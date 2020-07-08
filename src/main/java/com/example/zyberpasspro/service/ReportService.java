package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Report;
import com.example.zyberpasspro.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReportService implements IReportService {
    @Autowired
    private ReportRepository reportRepository;
    @Override
    public List<Report> findAll() {
        return (List<Report>) reportRepository.findAll();
    }

    @Override
    public Report createReport(Report report) {
        return reportRepository.save(report);
    }

    @Override
    public Report updateReport(Report report, Long l) {
        return null;
    }

    @Override
    public Report getReport(Long l) {
        return reportRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteReport(Long l) {
        reportRepository.deleteById(l);
        return l;
    }
}
