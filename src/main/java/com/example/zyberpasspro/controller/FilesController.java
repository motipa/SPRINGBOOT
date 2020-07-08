package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Files;
import com.example.zyberpasspro.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/files")
public class FilesController {

  @Autowired
   private IFileService fileService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Files> getAllUsers() {
        // This returns a JSON or XML with the users
        return fileService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    Files CreateFiles(@RequestBody Files files) {
        // This returns a JSON or XML with the users
        return fileService.createFiles(files);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Files replaceFiles(@RequestBody Files files, @PathVariable Long id) {

        return  fileService.updateFiles(files,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Files one(@PathVariable Long id) {

        return  fileService.getFiles(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteFiles(@PathVariable Long id) {

        return  fileService.deletFiles(id);
    }
}
