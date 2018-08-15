package org.spring.series.core.annotation;

import org.spring.series.core.bean.EmployeeAutowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByType {



	/**
	 *  
	 */
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/springcore/series/spring-core-annotation-context.xml");
		EmployeeAutowired empAutowired = (EmployeeAutowired)context.getBean("employee");
		System.out.println(empAutowired.toString());
	}
	

}
