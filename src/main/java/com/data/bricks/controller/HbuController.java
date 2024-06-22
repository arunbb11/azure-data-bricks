package com.data.bricks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.bricks.entity.Hbu;
import com.data.bricks.service.HbuService;

@RestController
@RequestMapping("/api")
public class HbuController {

    @Autowired
    private HbuService hbuService;
    

    @GetMapping("/dimhbus")
    public List<Hbu> getAllHbu() {
        return hbuService.getAllHbu();
    }
}
