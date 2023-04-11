package com.oopsprogram;

public class Student {
	String name;
	int age;
	String gender;
	
	public Student(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
    public void display()
    {
    	System.out.println("name="+name+" age="+age+" gender="+gender);
    }
	public static void main(String[] args) {
		
        Student s= new Student("Mahi",27,"female");
        s.display();
	}

}
