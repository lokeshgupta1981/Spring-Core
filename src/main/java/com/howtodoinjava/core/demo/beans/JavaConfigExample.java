package com.howtodoinjava.core.demo.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class JavaConfigExample 
{
	public static void main( String[] args )
    {
        //Method 1
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         
        //Method 2
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
         
        EmployeeManager empManager = ctx.getBean(EmployeeManager.class);
        Employee emp = empManager.create();
         
        System.out.println(emp);
        
        ctx.close();
    }
}

@Configuration
@ComponentScan(basePackages = "com.howtodoinjava.core.demo.beans")
class AppConfig {
     
}

interface EmployeeManager {
	public Employee create();
}


@Service
class EmployeeManagerImpl implements EmployeeManager {
 
    @Override
    public Employee create() {
        Employee emp =  new Employee();
        emp.setId(1);
        emp.setName("Lokesh");
        return emp;
    }
}

@Getter
@Setter
@ToString
class Employee 
{
	private long id;
	private String name;
}
