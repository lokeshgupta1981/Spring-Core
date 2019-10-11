package com.howtodoinjava.core.demo.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
