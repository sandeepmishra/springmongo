package org.spring.series.core.postprocessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EmployeePPImpl implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{

	private String empId;
	private String empName;
	private String designation;
	private String salary;
	private String orgnization;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getOrgnization() {
		return orgnization;
	}
	public void setOrgnization(String orgnization) {
		this.orgnization = orgnization;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Id: "+empId+" Employee Name: "+empName+" Designation: "+designation+" Salary: "+salary
				+" Orgnization: "+orgnization;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Set Application Context "+applicationContext);
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Set Bean Factory "+beanFactory);
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Set Bean Name "+name);
	}
	
	@PostConstruct
	public void customInit(){
		System.out.println("Methods annotated with @PostConstruct");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nafterPropertiesSet() as defined by the InitializingBean callback interface");
	}
	
	// declared in bean definition with attribute init-method="initXML"
    public void initXML(){
        System.out.println("\nA custom configured init() method : setting attribute init-method attribute in the bean defintion");
    }
    
    @PreDestroy
    public void customDestroy(){
        System.out.println("\nMethods annotated with @PreDestroy");
    }
    
    @Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
    	System.out.println("\ndestroy() as defined by the DisposableBean callback interface");
	}
    
    // declared in bean definition with attribute destroy-method="destroyXML"
    public void destroyXML(){
        System.out.println("\nA custom configured destroy() method : setting attribute destroy-method attribute in the bean defintion");
    }
    
}
