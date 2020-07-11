package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Register;
import com.example.zyberpasspro.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Stream;

@Service
public class RegisterService implements IRegisterService {
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private RegisterRepository registerRepository;
    @Override
    public List<Register> findAll() {
        return (List<Register>) registerRepository.findAll();
    }

    @Override
    public Register createRegister(Register register) {
        return registerRepository.save(register);
    }

    @Override
    public Register updateRegister(Register register, Long l) {
        return null;
    }

    @Override
    public Register getRegister(Long l) {
        return registerRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteRegister(Long l) {
        registerRepository.deleteById(l);
        return l;
    }





    }



