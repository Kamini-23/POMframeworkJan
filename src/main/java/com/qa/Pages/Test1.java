package com.qa.Pages;

public class Test1 {

	// this keyword
	// this keyword is used to differentate between instance variable and local variable
	// whenever we want to assign a value to instance varibale we can use this keyword
	// if we want to use instance variable of a parent class in child classes we will use this keyword
	
	int i;  // instance variable
	
	public void getvalue(int i)  
	{
		this.i=i;  
	}
	public void set()
	{
		System.out.println(i);  
	}
	

}
