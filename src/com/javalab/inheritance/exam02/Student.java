package com.javalab.inheritance.exam02;

public class Student extends Human { // class s

	// 필드
	int stdNo; // 학번
	String major; // 전공

	// 생성자

	public void studentInfo() {
		this.HumanInfo(); // 부모 정보 출력 메소드 호출		this.를 붙인다 그럼내꺼
		System.out.println("[Student Info]");
		System.out.println("학번 : " + this.stdNo);
		System.out.println("전공 : " + this.major);

	}

	// 오버로딩 생성자
	public Student(String name, int age, int stdNo, String major) {
		super(name, age);
		this.stdNo = stdNo;
		this.major = major;
	}

	// 기본생성자
	public Student(String name, int age) {
		super(name, age);
		
	}
	
} // class e
