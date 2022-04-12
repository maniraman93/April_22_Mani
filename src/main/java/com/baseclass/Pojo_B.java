package com.baseclass;

public class Pojo_B 
{
	public static void main(String[] args) 
		{
			Pojo_A a = new Pojo_A();
			int a2 = a.getA();
			System.out.println("a2 = "+ a2);
			a.setA(100);
			int a3 = a.getA();
			System.out.println("a3 = "+a3);
		}
}
