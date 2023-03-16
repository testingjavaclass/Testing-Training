package com.JAVAPROGRAMS;

import java.util.Scanner;

public class Interview2 {

	public static void main(String[] args)
	//prime number
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n =scn.nextInt();
		int a=1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				a=0;
				break;
				
			}
		}
		if(a==1)
		{
			System.out.println(n+" is a prime number");
		}
		else 
		{
			System.out.println(n+" is not a prime number");
		}
		
		
		
		
	}

}
