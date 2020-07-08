package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Category;

import java.util.List;
public interface ICategoryService {
    List<Category> findAll();
    public Category createCategory(Category category);
    public Category updateCategory(Category category, Long l);
    public Category getCategory(Long l);
    public Long deleteCategory(Long l);
}
