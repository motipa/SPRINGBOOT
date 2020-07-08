package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Title;

import java.util.List;

public interface ITitleService {

    List<Title> findAll();
    public Title createTitle(Title title);
    public Title updateTitle(Title title, Long l);
    public Title getTitle(Long l);
    public Long deleteTitle(Long l);
}
