package org.spring.series.core.beanscope;

import org.spring.series.core.bean.Address;
import org.spring.series.core.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonCheck {

	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"org/springcore/series/spring-core-context.xml");
		/**
		 * Singleton Returns single bean instance per IOC container(context1 and
		 * context2 will return two different beans)
		 */
		Employee emp1 = (Employee) context1.getBean("employee");
		emp1.setName("sandeep");
		System.out.println(emp1.toString());
		Employee emp2 = (Employee) context1.getBean("employee");
		System.out.println(emp2.getName());

		ApplicationContext context2 = new ClassPathXmlApplicationContext(
				"org/springcore/series/spring-core-context.xml");
		emp2 = (Employee) context2.getBean("employee");
		System.out.println(emp2.toString());

		/**
		 * ProtoType Returns new bean instance each time requested.
		 */
		System.out.println("-------------checking address scope------------");
		Address address1 = (Address) context1.getBean("consAddressProtyType");
		address1.setCity("Belgum");
		System.out.println(address1.toString());

		Address address2 = (Address) context1.getBean("consAddressProtyType");
		System.out.println(address2.toString());

		/**
		 * The request, session, and global session scopes are only available if
		 * you use a web-aware Spring ApplicationContext implementation
		 * 
		 * request: Returns a single instance for every HTTP request call.
		 * 
		 * session: Returns a single instance for every HTTP session.
		 * 
		 * global session: global session scope is equal as session scope on
		 * portlet-based web applications.
		 */
	}
}
