package com.data.bricks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.bricks.entity.Hbu;
import com.data.bricks.repository.HbuRepository;

@Service
public class HbuService {

    @Autowired
    private HbuRepository hbuRepository;
    
    public List<Hbu> getAllHbu() {
        return hbuRepository.findAll();
    }
}

