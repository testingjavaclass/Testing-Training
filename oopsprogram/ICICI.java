package com.oopsprogram;

public class ICICI extends RBI{
	//method overriding 
	public void simpleinterest()
	{
		System.out.println("Home loan is 8%");
	}

	public static void main(String[] args) {
		ICICI i=new ICICI();
		i.simpleinterest();
	}

}
