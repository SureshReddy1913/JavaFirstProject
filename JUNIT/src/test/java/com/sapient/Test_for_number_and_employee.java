package com.sapient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class Test_for_number_and_employee {
	
	Number number;
	@Before
	public void setUp()
	{
		number=new Number();
	}
	
	@Test
	public void test_for_true_primenumber() throws InvalidNumberException
	{
		int result=number.check_prime(7);
		//System.out.println(result);
		assertEquals(1,result);
	}

	@Test
	public void test_for_false_primenumber() throws InvalidNumberException
	{
		int result=number.check_prime(10);
		assertEquals(0,result);
	}
	
	@Test(expected=InvalidNumberException.class)
	public void test_for_invalid_input_primenumber() throws InvalidNumberException
	{
		number.check_prime(0);
	}

	@Test
	public void test_for_true_amstrongnumber() throws InvalidNumberException
	{
		int result=number.check_amstrong_number(153);
		assertEquals(1,result);
	}
	
	@Test
	public void test_for_false_amstrongnumber() throws InvalidNumberException
	{
		int result=number.check_amstrong_number(159);
		assertEquals(0,result);
	}
	
	@Test(expected=InvalidNumberException.class)
	public void test_for_invalid_input_amstrongnumber() throws InvalidNumberException
	{
		number.check_amstrong_number(-159);
	}
	
	@Test
	public void test_for_true_palindromenumber() throws InvalidNumberException
	{
		int result=number.check_palindrome(151);
		assertEquals(1,result);
	}
	
	@Test
	public void test_for_false_palindromenumber() throws InvalidNumberException
	{
		int result=number.check_palindrome(152);
		assertEquals(0,result);
	}
	
	@Test(expected=InvalidNumberException.class)
	public void test_for_invalid_input_palindromenumber() throws InvalidNumberException
	{
		number.check_palindrome(-159);
	}
	
	@Test
	public void test_AddEmployee_class()
	{
		EmployeePOJO employee=new EmployeePOJO(101,"Suresh","Hyderabad");
		AddEmployee employeelist=new AddEmployee();
		employeelist.addEmployee(employee);
		assertNotNull(employeelist.getEmployee(101));
	}
	
	@Test
	public void test_AddEmployee_class_for_invalidID()
	{
		EmployeePOJO employee=new EmployeePOJO(101,"Suresh","Hyderabad");
		AddEmployee employeelist=new AddEmployee();
		employeelist.addEmployee(employee);
		assertNull(employeelist.getEmployee(102));
		
	}
	
	
}
