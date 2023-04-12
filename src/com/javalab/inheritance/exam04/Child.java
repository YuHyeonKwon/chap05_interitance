package com.javalab.inheritance.exam04;

public class Child extends Parent{ // class s

	int x = 200;
	
	// 메소드 오버라이딩(부모의 메소드를 다시 정의함)
	@Override		// Override 어노테이션 : 메타데이터 , 오버라이드한 메소드 위에 붙인다 , Override 기능-검수역할
	void display2() {
		System.out.println("Child display2( )");
	}
	
	// 자식이 새롭게 추가한 메소드
	void display3() {
		System.out.println("Child display3( )");
	}
} // class e
