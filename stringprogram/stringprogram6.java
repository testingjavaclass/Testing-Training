package com.stringprogram;

public class stringprogram6 {

	public static void main(String[] args) {
		String s="Ja0997va Dev766972lop";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9' )
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);

	}

}
