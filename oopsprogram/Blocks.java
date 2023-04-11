package com.oopsprogram;

public class Blocks {
	//blocks in java
	static int a;
	int b;
	static
	{
		a=88;
		System.out.println("static block a="+a);
	}
	static
	{
		a=32;
		System.out.println("static block a="+a);
	}
	Blocks()
	{
		System.out.println("Constructor");
	}
	{
		int b=40;
	
		System.out.println("Non static block");
	}
	

	public static void main(String[] args) {
	Blocks b1=new Blocks();
	System.out.println("Main starts");
	System.out.println("Main ends");
	System.out.println("B="+b1.b);

	}

}
