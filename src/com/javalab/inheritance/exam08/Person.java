package com.javalab.inheritance.exam08;

public class Person { // class s

	protected String name;
	protected int age;
	protected String eMail;
	protected String department;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String eMail, String department) {
		this.name = name;
		this.age = age;
		this.eMail = eMail;
		this.department = department;
	}
	
	public void showHumanInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("이메일: " + this.eMail);
		System.out.println("학과: " + this.department);
		
	}
} // class e
