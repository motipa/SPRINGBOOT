package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.SubCategory;

import java.util.List;

public interface ISubCategoryService {

    List<SubCategory> findAll();
    public SubCategory createSubCatergory(SubCategory subCategory);
    public SubCategory updateSubCategory(SubCategory subCategory, Long l);
    public SubCategory getSubCategory(Long l);
    public Long deleteSubCategory(Long l);
}
