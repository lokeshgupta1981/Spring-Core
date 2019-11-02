package com.howtodoinjava.core.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = 
		    	  new ClassPathXmlApplicationContext("com/howtodoinjava/core/autowire/byType/application-context.xml");
		 
		    	EmployeeBean employee = (EmployeeBean)context.getBean("employee");
		    	System.out.println(employee.getFullName());
		    	System.out.println(employee.getDepartmentBean().getName());
	}
}
