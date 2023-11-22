package com.example.Zipcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Zipcode.entity.DetailsInfo;
import com.example.Zipcode.repo.DetailsInfoRepo;
import com.example.Zipcode.service.DetailsService;

@RestController
public class DetailsController{
    @Autowired
    DetailsService service;
    @Autowired
    DetailsInfoRepo repo;

    @PostMapping
    public String addMethod(@RequestBody DetailsInfo detailsInfo){
        return  service.add(detailsInfo);

    }

    @GetMapping("/{zipcode}")
    public DetailsInfo getbyzipcode(@PathVariable int zipcode){
        return repo.findByZipcode(zipcode);
    }
}
