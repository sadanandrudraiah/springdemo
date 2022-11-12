package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.service.DepartmentService;

public class TestHello {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DepartmentService service = (DepartmentService) context.getBean("departmentService");
		
		//service.create(444, "Auto config");
		
		System.out.println(service.getDept(444));
		
	}

}
