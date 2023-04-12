package com.javalab.inheritance.exam08;

public class Student extends Person{ // class s
	
	protected String stdId;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age, String eMail, String department, String stdId) {
		super(name, age, eMail, department);
		this.stdId = stdId;
	}
	
	@Override
	public void showHumanInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("이메일: " + this.eMail);
		System.out.println("학번: " + this.stdId);
		System.out.println("학과: " + this.department);
	}
	
} // class e
