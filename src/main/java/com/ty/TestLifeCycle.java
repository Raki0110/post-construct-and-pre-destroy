package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new 
				ClassPathXmlApplicationContext("my_conf.xml");
		Student student = (Student) configurableApplicationContext.getBean("myStudent");
		System.out.println(student);
		configurableApplicationContext.close();
	}

}
