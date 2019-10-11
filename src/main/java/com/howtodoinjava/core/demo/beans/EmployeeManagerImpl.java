package com.howtodoinjava.core.demo.beans;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
class EmployeeManagerImpl implements EmployeeManager {
 
    @Override
    public Employee create() {
        Employee emp =  new Employee();
        emp.setId(1);
        emp.setName("Lokesh");
        return emp;
    }
    
    @PostConstruct
	public void onInit(){
		System.out.println("EmployeeManagerImpl Bean is Created !!");
	}
}
