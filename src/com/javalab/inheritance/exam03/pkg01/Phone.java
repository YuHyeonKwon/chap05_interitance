package com.javalab.inheritance.exam03.pkg01;
/**
 * 부모클래스
 */
public class Phone extends Object{ // class s

	// 필드선언
	public String model;
	public String color;

	// 생성자 선언
	public Phone() {
//		super();		// java에서 쓰는 모든 클래스와 최고 조상은 object class 가 없다. 
	}

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// phoneInfo() 메소드 구현
	public void PhoneInfo() {
		System.out.println("[Phone Info]");
		System.out.println("모델 : " + this.model);
		System.out.println("색상 : " + this.color);

	}

} // class e
