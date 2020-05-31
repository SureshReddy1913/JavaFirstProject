package com.sapient.SpringQuestion;

import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demonstration {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		System.out.println("Enter employee code :");
		Scanner scanner=new Scanner(System.in);
		
		String emp_code=scanner.next();
		
		EmployeeList employeeList= (EmployeeList) context.getBean("EmployeeList");
		
		Map <String,EmployeePOJO> employee_list= employeeList.getEmployee_list();
		
		System.out.println("Id of the employee is:- "+employee_list.get(emp_code).getId());
		System.out.println("Name of the employee is:- "+employee_list.get(emp_code).getName());
		System.out.println("City of the employee is:- "+employee_list.get(emp_code).getCity());
		
	}
}
