package com.stringprogram;

public class stringprogram5 {

	public static void main(String[] args) {
		String s="Java Developer";
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			
			if(s1.indexOf(c)==-1)
			{
	          s1=s1+c;
	  		} 
			System.out.println(s1);
		}
		
		
		
	}

}
