package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Register;

import java.util.List;

public interface IRegisterService {

    List<Register> findAll();
    public Register createRegister(Register register);
    public Register updateRegister(Register register, Long l);
    public Register getRegister(Long l);
    public Long deleteRegister(Long l);

}
