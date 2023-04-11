package com.stringprogram;

public class stringprogram3 {
	//reverse order

	public static void main(String[] args) {
		String s= new String("Java program");
		int n=s.length()-1;
		for(int i=n;i>=0;i--)
		{
			
			System.out.print(s.charAt(i));
		}

	}

}
