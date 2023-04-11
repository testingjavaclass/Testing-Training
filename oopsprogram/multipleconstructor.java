package com.oopsprogram;

public class multipleconstructor {
	multipleconstructor()
	{
		this(66);
		System.out.println("Default");
		
	}
	multipleconstructor(int a)
	{
		this("Mahi");
		System.out.println("int parameters");
	}
	multipleconstructor(String s)
	{
		System.out.println("String parameters");
	}
	public static void main(String[] args) {
		multipleconstructor m=new multipleconstructor();
		

	}

}



	
