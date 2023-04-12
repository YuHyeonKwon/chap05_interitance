package com.javalab.inheritance.exam02;

public class StudentMain { // class s

	public static void main(String[] args) { // main s

		// 자식 객체 생성 ( 오버로딩 생성자 호출 )
		Student std = new Student("김미소", 23, 2021030221, "컴퓨터공학과");
		std.studentInfo();
	} // main e

} // class e
