package com.sapient;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	
	List<EmployeePOJO> list = new ArrayList();
	
	void addEmployee(EmployeePOJO employee)
	{
		list.add(employee);
	}

	EmployeePOJO getEmployee(int id)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getId()==id)
			{
				return list.get(i);
			}
		}
		return null;
	}
}
