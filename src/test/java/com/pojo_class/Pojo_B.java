package com.pojo_class;

public class Pojo_B {
	
	public static void main(String[]args) {
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		System.out.println("Age:" +age);
		
		a.setAge(12);
		
		System.out.println("After Setters");
		
		 int age1= a.getAge();
		 System.out.println((age1));
		 
		 a.setAge(18);
		 
		 int age2 = a.getAge();
		 System.out.println(age2);
		 
		 
		
	}

}
