package com.JAVAPROGRAMS;

public class stateandnonstate {
	static int i;
	int j;
	int k;
	
	public static void method1()
	{
		i=555;
				
		System.out.println("i="+i);
	}
	public void method2()
	{
		j=222;
		k=333;
	   System.out.println(j);
	}

	public static void main(String[] args) {
		method1();
		stateandnonstate s=new stateandnonstate();
		s.method2();
		
		
	}

}
