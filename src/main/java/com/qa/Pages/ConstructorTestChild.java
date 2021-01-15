package com.qa.Pages;

public class ConstructorTestChild extends ConstructorTest {
	
	// here compiler will first fetch the constructor form parent class, 
	//execute it and then execute the current class constructor
	

	
	public ConstructorTestChild()
	{
		super(100);
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorTestChild obj = new ConstructorTestChild();

	}

}
