package com.javalab.inheritance.exam01;

public class Child extends Parent { // class s

	public String address;
	public String phone;

	// 기본생성자
	public Child() {
		super(); // 첫줄에서 부모 객체 기본 생성자 호출		컴퍼일러거 자동으로 부모 기본생성자를 호출해준다.
	}

	public Child(String address) {
		super("김길동", 29);		// super() 부모가 가진 생성자 호출, 부모 필드 초기화	, 항상 첫줄에 있어야함
		this.address = address;		// 자기 필드 초기화
		System.out.println("자식 객채의 생성자1");
	}

	public Child(String address, String phone) {
		this.address = address;
		this.phone = phone;
		System.out.println("자식 객체의 생성자2");
	}
} // class e
