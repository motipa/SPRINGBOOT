package com.example.zyberpasspro.service;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.Stat;

import java.util.List;

public interface IStatService {
    List<Stat> findAll();
    public Stat createStat(Stat stat);
    public Stat updateStat(Stat stat, Long l);
    public Stat getStat(Long l);
    public Long deleteStat(Long l);
}
