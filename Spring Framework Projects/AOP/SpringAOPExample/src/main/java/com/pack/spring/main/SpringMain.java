package com.pack.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Hari Krishna");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}
