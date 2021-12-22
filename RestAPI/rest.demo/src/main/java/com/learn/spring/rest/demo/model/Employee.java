package com.learn.spring.rest.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    
    @Id
    public int id;

    public String name;

    //Default Constructor mandatory for JPA
    public Employee(){}

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return name;
    }
}
