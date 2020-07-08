package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Folder;
import com.example.zyberpasspro.service.IFolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/folder")
public class FolderController {
    @Autowired
   private IFolderService folderService;
    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Folder> getAllUsers() {
        // This returns a JSON or XML with the users
        return folderService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    Folder CreateFolder(@RequestBody Folder folder) {
        // This returns a JSON or XML with the users
        return folderService.createFolder(folder);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Folder replaceFolder(@RequestBody Folder folder, @PathVariable Long id) {

        return  folderService.updateFolder(folder,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Folder one(@PathVariable Long id) {

        return  folderService.getFolder(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteFolder(@PathVariable Long id) {

        return  folderService.deleteFolder(id);
    }
}
