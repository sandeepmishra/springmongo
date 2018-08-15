package org.spring.series.core.annotation;

import org.spring.series.core.bean.EmployeeAutowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireByNameService {

	/**
	 * put autowire="byName" in class whose property should have autowired by name (we can remove 
	 * <property name="address" ref="address" /> tag  from bean class)
	 * 
	 * autowiring byName will look for bean in container which will have same as property needs to be autowired.
	 *  
	 */
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/springcore/series/spring-core-annotation-context.xml");
		EmployeeAutowired empAutowired = (EmployeeAutowired)context.getBean("employee");
		System.out.println(empAutowired.toString());
	}
	
}
