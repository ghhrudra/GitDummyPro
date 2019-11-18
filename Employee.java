package com.web.FirstWebsiteNov;

public class Employee {
	
	
	int id;
	String name;
	double salary;
	String managerName;
	
	
	void printEmployeeDetails()
	{
		System.out.println(id+" "+name+" "+ salary);
	}
	
	double getSalaryBonus()
	{
		return salary*.1;
	}
	

}
