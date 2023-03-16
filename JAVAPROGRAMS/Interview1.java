package com.JAVAPROGRAMS;

public class Interview1 {

	public static void main(String[] args) {
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter a number");
		int a =scn.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			
		
		}
		System.out.println(fact);		
		

	}

}
