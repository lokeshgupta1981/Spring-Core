package com.howtodoinjava.core.demo.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigExample 
{
	public static void main( String[] args )
    {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/howtodoinjava/core/demo/beans/beans.xml");
        
        Employee employee = ctx.getBean(Employee.class);
         
        Department department = ctx.getBean(Department.class);
         
        Operations operations = ctx.getBean(Operations.class);
 
        System.out.println(department);
        System.out.println(employee);
 
        operations.helloWorld();
    }
}