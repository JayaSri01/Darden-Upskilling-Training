package com.example.Zipcode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Zipcode.entity.DetailsInfo;

@Repository
public interface DetailsInfoRepo  extends JpaRepository<DetailsInfo,Integer> {
    DetailsInfo findByZipcode(int zipcode);
}
