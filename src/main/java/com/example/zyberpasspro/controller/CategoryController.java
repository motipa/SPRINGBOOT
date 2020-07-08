package com.example.zyberpasspro.controller;


import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Category;


import com.example.zyberpasspro.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @PostMapping(path="/add")
    public @ResponseBody
    Category CreateCategory(@RequestBody Category category) {
        // This returns a JSON or XML with the users
        return categoryService.createCategory(category);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Category replaceCategory(@RequestBody Category category, @PathVariable Long id) {

        return  categoryService.updateCategory(category,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Category one(@PathVariable Long id) {

        return  categoryService.getCategory(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteCategory(@PathVariable Long id) {

        return  categoryService.deleteCategory(id);
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Category> getAllUsers() {
        // This returns a JSON or XML with the users
        return categoryService.findAll();
    }

}
