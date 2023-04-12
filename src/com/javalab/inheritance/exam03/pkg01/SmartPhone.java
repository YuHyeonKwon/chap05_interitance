package com.javalab.inheritance.exam03.pkg01;

public class SmartPhone extends Phone { // class s

	// 필드
	public String frequency;

	public SmartPhone() {
		super();
	}

	public SmartPhone(String model, String color) {
		super(model, color);
	}

	public SmartPhone(String model, String color, String frequency) {
		super(model, color);
		this.frequency = frequency;
	}

	public void showSmartPhoneInfo() {
		System.out.println("[SmartPhone Info]");
		System.out.println("모델 : " + this.model);
		System.out.println("색상 : " + this.color);
		System.out.println("주파수 : " + this.frequency);
	}
} // class e
