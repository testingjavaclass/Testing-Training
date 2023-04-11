package com.oopsprogram;

public class Testmain {

	public static void main(String[] args) {
		Test3 t1=new Test3();
		t1.Demo3();
		Test2 t2=new Test2();
		t2.Demo1();
		Test1 t=new Test1();
		t.Demo1();

	}
	

}
//multilevel inheritance
class Test1
{
	public void Demo1()
	{
		System.out.println("Demo1 method");
	}}
class Test2 extends Test1
{
	public void Demo2()
	{
		System.out.println("Demo2 method");
	}}
class Test3 extends Test2
{
	public void Demo3()
	{
		System.out.println("Demo3 method");
	}}