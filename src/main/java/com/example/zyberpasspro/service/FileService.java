package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Files;
import com.example.zyberpasspro.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FileService  implements IFileService{
    @Autowired
    private FileRepository fileRepository;
    @Override
    public List<Files> findAll() {
        return (List<Files>) fileRepository.findAll();
    }

    @Override
    public Files createFiles(Files files) {
        return fileRepository.save(files);
    }

    @Override
    public Files updateFiles(Files files, Long l) {
        return null;
    }

    @Override
    public Files getFiles(Long l) {
        return fileRepository.findById(l)
                .orElseThrow(() -> new AdminNotFoundException(l));
    }

    @Override
    public Long deletFiles(Long l) {
        fileRepository.deleteById(l);
        return l;
    }
}
