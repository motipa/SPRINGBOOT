package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.SubCategory;
import com.example.zyberpasspro.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubCategoryService implements ISubCategoryService{
    @Autowired
    private SubCategoryRepository subCategoryRepository;
    @Override
    public List<SubCategory> findAll() {
        return (List<SubCategory>) subCategoryRepository.findAll();
    }

    @Override
    public SubCategory createSubCatergory(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    @Override
    public SubCategory updateSubCategory(SubCategory subCategory, Long l) {
        return null;
    }

    @Override
    public SubCategory getSubCategory(Long l) {
        return subCategoryRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteSubCategory(Long l) {
        subCategoryRepository.deleteById(l);
        return l;
    }
}
