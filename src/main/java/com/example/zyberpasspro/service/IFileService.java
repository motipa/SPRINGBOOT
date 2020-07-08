package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Files;
import com.example.zyberpasspro.repository.FileRepository;

import java.util.List;

public interface IFileService {

    List<Files> findAll();
    public Files createFiles(Files files);
    public Files updateFiles(Files files, Long l);
    public Files getFiles(Long l);
    public Long deletFiles(Long l);
}
