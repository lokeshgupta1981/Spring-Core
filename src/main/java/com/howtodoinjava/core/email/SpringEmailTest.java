package com.howtodoinjava.core.email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringEmailTest 
{
	public static void main(String[] args) 
    {
        //Create the application context
        @SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext
        			("classpath:com/howtodoinjava/core/email/applicationContext.xml");
         
        //Get the mailer instance
        EmailService mailer = (EmailService) context.getBean("emailService");
 
        //Send a composed mail
        mailer.sendMail("somebody@gmail.com", "Test Subject", "Testing body");
 
        //Send a pre-configured mail
        mailer.sendPreConfiguredMail("Exception occurred everywhere.. where are you ????");
    }
}
