package com.learn.spring.rest.demo.operations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.learn.spring.rest.demo.model.Employee;

//@Component
public interface DBOperations extends JpaRepository<Employee, Integer>{
    
}
