package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Content;
import com.example.zyberpasspro.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContentService implements IContentService {
    @Autowired
    private ContentRepository contentRepository;
    @Override
    public List<Content> findAll() {
        return (List<Content>) contentRepository.findAll();
    }

    @Override
    public Content createContent(Content content) {
        return contentRepository.save(content);
    }

    @Override
    public Content updateContent(Content content, Long l) {
        return null;
    }

    @Override
    public Content getContent(Long l) {
        return contentRepository.findById(l)
                .orElseThrow(() -> new AdminNotFoundException(l));
    }

    @Override
    public Long deleteContent(Long l) {
        contentRepository.deleteById(l);
        return l;
    }
}
