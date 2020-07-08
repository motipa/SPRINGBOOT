package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Category;
import com.example.zyberpasspro.model.Content;
import com.example.zyberpasspro.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.security.krb5.internal.ccache.CredentialsCache;

@RestController
@RequestMapping(path="/content")

public class ContentController {
    @Autowired
    private IContentService contentService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Content> getAllUsers() {
        // This returns a JSON or XML with the users
        return contentService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    Content CreateContent(@RequestBody Content content) {
        // This returns a JSON or XML with the users
        return contentService.createContent(content);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Content replaceAnswer(@RequestBody Content content, @PathVariable Long id) {

        return  contentService.updateContent(content,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Content one(@PathVariable Long id) {

        return  contentService.getContent(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteContent(@PathVariable Long id) {

        return  contentService.deleteContent(id);
    }
}
