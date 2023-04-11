package com.oopsprogram;

public class Demo1 {
	//Default
	Demo1()
	{
		System.out.println("Default Constructor");
	
	}
	//parametrised
   Demo1(int a)
   {
	System.out.println("parametrised constructor");   
   }
	static int i;
	static void m1()
	{
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		Demo1 d2=new Demo1();
		Demo1 d3=new Demo1();
		Demo1 d1=new Demo1(33);
		
		 System.out.println(i);
		 m1();

	}

}
