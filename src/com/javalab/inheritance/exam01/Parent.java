package com.javalab.inheritance.exam01;

/**
 * 부모 클래스
 */
public class Parent { // class s

	public String name;
	public int age;

	// 기본생성자 ( 부모는 꼭 기본생성자가 있어야한다. )
	public Parent() {
		System.out.println("여기는 부모 객체의 기본 생성자");
	}

	public Parent(String name, int age) {
		System.out.println("여기는 무보 객체의 오버로딩 생성자");
		this.name = name;
		this.age = age;
	}
} // class e
