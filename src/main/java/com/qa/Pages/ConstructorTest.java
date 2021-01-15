package com.qa.Pages;

public class ConstructorTest {
	public ConstructorTest()
	{
		System.out.println("my first constructor of parent");
	}

	
	public ConstructorTest(int i)
	{
		System.out.println("my parametrized constructor");

		System.out.println(i);
		
		
	}
	
	public ConstructorTest(String empName, int empno)
	{
		System.out.println("my parametrized constructor 2");

		System.out.println(empName + " "+ empno);
	
		
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ConstructorTest obj= new ConstructorTest();
		ConstructorTest obj1= new ConstructorTest(20);
		ConstructorTest obj3= new ConstructorTest(30);
		ConstructorTest obj4= new ConstructorTest("Sonal",184672);

	}

}
