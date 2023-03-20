package com.JAVAPROGRAMS;

public class Staticvariable {
	static String name; //Static variable refer by class name
	int a;//Non static variable- we should create an object
    int age;
    char b;
	public static void main(String[] args) {
		System.out.println(Staticvariable.name);
		
		Staticvariable sv=new Staticvariable();//classname object=new classname()
				sv.a=32;//object.variable
		
		System.out.println("a="+sv.a);
		sv.age=45;
		System.out.println("age="+sv.age);
		sv.b='D';
	    System.out.println("b="+sv.b);
		
	}

}
