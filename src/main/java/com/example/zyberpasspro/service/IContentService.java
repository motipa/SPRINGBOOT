package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Category;
import com.example.zyberpasspro.model.Content;

import java.util.List;

public interface IContentService {
    List<Content> findAll();
    public Content createContent(Content content);
    public Content updateContent(Content content, Long l);
    public Content getContent(Long l);
    public Long deleteContent(Long l);
}
