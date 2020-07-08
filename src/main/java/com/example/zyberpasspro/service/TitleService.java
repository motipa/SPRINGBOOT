package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Title;
import com.example.zyberpasspro.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TitleService implements ITitleService{
    @Autowired
    private TitleRepository titleRepository;
    @Override
    public List<Title> findAll() {
        return (List<Title>) titleRepository.findAll();
    }

    @Override
    public Title createTitle(Title title) {
        return titleRepository.save(title);
    }

    @Override
    public Title updateTitle(Title title, Long l) {
        return null;
    }

    @Override
    public Title getTitle(Long l) {
        return titleRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteTitle(Long l) {
        titleRepository.deleteById(l);
        return l;
    }
}
