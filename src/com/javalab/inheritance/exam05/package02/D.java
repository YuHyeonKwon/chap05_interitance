package com.javalab.inheritance.exam05.package02;

import com.javalab.inheritance.exam05.package01.A;

// 상속 관계가 있는 다른 패키지의 클래스
public class D extends A { // class s

	//생성자 선언
	public D() {
		//A() 생성자 호출
		super();		//o
	}
	
	//메소드 선언
	public void method1() {
		//A 필드값 변경
		this.field = "Value";		//o
		
		//A 메소드 호출
		this.method();				//o
	}
	
	public void method2() {
//		A a = new A();			//x 자식이 부모를 생성하려면 super( ) 를 통해서 생성해야한다.
//		a.field = "Value";		//x
//		a.method();				//x
		
	}
} // class e
