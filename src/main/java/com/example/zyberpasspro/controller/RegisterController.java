package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Register;
import com.example.zyberpasspro.service.IRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/register")
public class RegisterController {
   @Autowired
    private IRegisterService registerService;


    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Register> getAllUsers() {
        // This returns a JSON or XML with the users
        return registerService.findAll();
    }

    @PostMapping(path="/add")
    public @ResponseBody
    Register CreateRegister(@RequestBody Register register) {
        // This returns a JSON or XML with the users
        return registerService.createRegister(register);
    }
    @PutMapping("/update/{id}")
    public @ResponseBody Register replaceRegister(@RequestBody Register register, @PathVariable Long id) {

        return  registerService.updateRegister(register,id );
    }
    @GetMapping("/{id}")
    public  @ResponseBody Register one(@PathVariable Long id) {

        return  registerService.getRegister(id);
    }
    @DeleteMapping("/{id}")
    public  @ResponseBody Long deleteRegister(@PathVariable Long id) {

        return  registerService.deleteRegister(id);
    }
}
