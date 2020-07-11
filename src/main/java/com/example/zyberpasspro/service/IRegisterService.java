package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Register;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.stream.Stream;

public interface IRegisterService {

    List<Register> findAll();
    public Register createRegister(Register register);
    public Register updateRegister(Register register, Long l);
    public Register getRegister(Long l);
    public Long deleteRegister(Long l);



}
