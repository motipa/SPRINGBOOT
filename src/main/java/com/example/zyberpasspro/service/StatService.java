package com.example.zyberpasspro.service;

import com.example.zyberpasspro.common.AdminNotFoundException;
import com.example.zyberpasspro.model.Stat;
import com.example.zyberpasspro.repository.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatService implements IStatService{
    @Autowired
    private StatRepository statRepository;
    @Override
    public List<Stat> findAll() {
        return (List<Stat>) statRepository.findAll();
    }

    @Override
    public Stat createStat(Stat stat) {

        return   statRepository.save(stat);

    }

    @Override
    public Stat updateStat(Stat stat, Long l) {
        return null;
    }

    @Override
    public Stat getStat(Long l) {
        return statRepository.findById(l).orElseThrow(()->new AdminNotFoundException(l));
    }

    @Override
    public Long deleteStat(Long l) {
        statRepository.deleteById(l);
        return l;
    }
}
