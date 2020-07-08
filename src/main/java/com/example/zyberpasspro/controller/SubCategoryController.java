package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.SubCategory;
import com.example.zyberpasspro.service.ISubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/subcategory")
public class SubCategoryController {
@Autowired
  private ISubCategoryService subCategoryService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<SubCategory> getAllUsers() {
        // This returns a JSON or XML with the users
        return subCategoryService.findAll();
    }

  @PostMapping(path="/add")
  public @ResponseBody
  SubCategory CreateSubCategory(@RequestBody SubCategory subCategory) {
    // This returns a JSON or XML with the users
    return subCategoryService.createSubCatergory(subCategory);
  }
  @PutMapping("/update/{id}")
  public @ResponseBody SubCategory replaceSubCategory(@RequestBody SubCategory subCategory, @PathVariable Long id) {

    return  subCategoryService.updateSubCategory(subCategory,id );
  }
  @GetMapping("/{id}")
  public  @ResponseBody SubCategory one(@PathVariable Long id) {

    return  subCategoryService.getSubCategory(id);
  }
  @DeleteMapping("/{id}")
  public  @ResponseBody Long deleteSubCategory(@PathVariable Long id) {

    return  subCategoryService.deleteSubCategory(id);
  }
}
