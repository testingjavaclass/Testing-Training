package com.JAVAPROGRAMS;

public class Variable3 {
	static int c;
	int d;
	int e;
	


	private static Variable3 v;
	public static void Test1(int c)
	{
		
		System.out.println(c);
	}

	public static void method1(int a)
	{
		System.out.println("a="+a);
	}
	
	public void method2(int b)
	{
		System.out.println("b="+b);
	}

	public static void main(String[] args) {
		Test1(54);
		Variable3.method1(255);
		Variable3.v=new Variable3();
		v.method2(234);
		c=123;
		System.out.println(c);
		v.d=77;
		v.e=129;
		System.out.println("d="+v.d+" e="+v.e);
		
		
		

	}
}

