package org.spring.series.core.annotation;

import org.spring.series.core.bean.EmployeeAutowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredService {
	@Autowired
	private EmployeeAutowired autowired;
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/springcore/series/spring-core-annotation-context.xml");
		EmployeeAutowired empAutowired = (EmployeeAutowired)context.getBean("employee");
		System.out.println(empAutowired.toString());
		new AutowiredService().printAutowired();
		
	}
	
	public void printAutowired(){
		System.out.println("print by autowired : "+autowired.toString());
	}
	
}
