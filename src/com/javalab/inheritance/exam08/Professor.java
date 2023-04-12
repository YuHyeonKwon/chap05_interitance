package com.javalab.inheritance.exam08;

public class Professor extends Person { // class s

	protected String pfId;
	
	public Professor() {
		super();
	}
	
	public Professor(String name, int age, String eMail, String department, String pfId) {
		super(name, age, eMail, department);		// 부모생성자 호출
		this.pfId = pfId;
		
	}
	
	public void showHumanInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("이메일: " + this.eMail);
		System.out.println("교수ID: " + this.pfId);
		System.out.println("학과: " + this.department);
	}
} // class e
