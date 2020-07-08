package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Category;
import com.example.zyberpasspro.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository repository;
    @Override
    public List<Category> findAll() {
        return (List<Category>) repository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return repository.save(category);
    }

    @Override
    public Category updateCategory(Category category, Long l) {
        return repository.findById(l)
                .map(category1 -> {
                    category1.setName(category.getName());
                    category1.setRegstatus(category.getRegstatus());
                    return repository.save(category1);
                })
                .orElseGet(() -> {
                    category.setId(l);
                    return repository.save(category);
                });
    }

    @Override
    public Category getCategory(Long l) {
        return repository.findById(l)
                .orElseThrow(() -> new AdminNotFoundException(l));
    }

    @Override
    public Long deleteCategory(Long l) {
        return null;
    }


}
