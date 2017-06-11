package org.spring.series.core.service;

import org.spring.series.core.bean.Address;
import org.spring.series.core.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeCheck {

	public static void main(String[] args) {
		employeeTest();
	}
	
	public static void employeeTest(){
		/**
		 * Bean factory initiates bean lazily, dosent supports annotation, loading multiple configuration files
		 * not possible
		 */
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("org/springcore/series/spring-core-context.xml"));
		/**
		 * instantiates bean eagerly, supports internationalization, can load multiple configuration files
		 * new ClassPathXmlApplicationContext(new String[]{“confg-1”, “confg-2”, “confg-3”});
		 */
		ApplicationContext context =new ClassPathXmlApplicationContext("org/springcore/series/spring-core-context.xml");
		/**
		 * Dependency Injection: 1. setter injection 2. constructor injection 3. Interface Injection
		 * 
		 */
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee.toString());
		
		/**
		 * 1. partial injection is possible with setter but not in constructure injection
		 * 2. constructor injection are immutable but setter are mutable
		 * 3. constructor injection for mandatory fields
		 */
		Address address = (Address)context.getBean("consAddress");//through constructor injection
		System.out.println(address.toString());
	}
}
