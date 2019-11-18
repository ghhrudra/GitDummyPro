package com.web.FirstWebsiteNov;

public class Employee {
	
	
	public	int id;
	public String name;
	public double salary;
	public String managerName;

	
	
	void printEmployeeDetails()
	{
		System.out.println(id+" "+name+" "+ salary);
	}
	
	double getSalaryBonus()
	{
		return salary*.1;
	}
	

}
