package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByMainClient {

	public static void main(String[] args) {
		
		ApplicationContext aContext =new ClassPathXmlApplicationContext("springBeansFile.xml");
		JobSeeker obj=(JobSeeker)aContext.getBean("jobseek");
		obj.setJs_id(101);
		obj.setName("John");
		obj.diplay();
		
		JobSeeker obj2=(JobSeeker)aContext.getBean("jobseek");
		obj2.setJs_id(102);
		obj2.setName("Jonny");
		
		obj.diplay();
		

	}

}
