package com.example.employeeapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeapplication.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
