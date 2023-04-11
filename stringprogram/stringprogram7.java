package com.stringprogram;

public class stringprogram7 {

	public static void main(String[] args) {
		//vowels

		String s="Java Developer";
		String s1="";
		for (int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				if(s1.indexOf(c)==-1)
				{
					s1=s1+c;	
				}
			
				
			}
			
		}
		System.out.println(s1);
	}

}
