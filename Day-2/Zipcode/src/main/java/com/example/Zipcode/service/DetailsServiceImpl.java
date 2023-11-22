package com.example.Zipcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Zipcode.entity.DetailsInfo;
import com.example.Zipcode.repo.DetailsInfoRepo;

@Service
public class DetailsServiceImpl implements DetailsService {

    @Autowired
    DetailsInfoRepo detailsInfoRepo;


    @Override
    public String add(DetailsInfo detailsInfo) {
        detailsInfoRepo.save(detailsInfo);
        return "Added Sucessfully";
    }
}
