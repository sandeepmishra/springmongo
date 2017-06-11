package org.spring.series.core.service;

import org.spring.series.core.postprocessor.EmployeePPImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorImple {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("org/springcore/series/spring-core-postprocessor-context.xml");
		EmployeePPImpl employee = (EmployeePPImpl)context.getBean("employee");
		System.out.println("Calling employee toString() : "+employee.toString());
	}
}
