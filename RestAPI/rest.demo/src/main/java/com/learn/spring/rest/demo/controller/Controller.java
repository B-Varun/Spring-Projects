package com.learn.spring.rest.demo.controller;

import java.util.List;
import java.util.Optional;

import com.learn.spring.rest.demo.model.Employee;
import com.learn.spring.rest.demo.operations.DBOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    public DBOperations repository;

    // Prints Hello World. 1st step for beginners. 
    @GetMapping("/helloWorld")
    public String printHelloWorld(){
        return "Hello World, Welcome to the first ReptAPI Program";
    }

    // Prints all the employees present in the DB
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }

    // Prints the data about the specific employee
    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return repository.findById(id);
    }

}
