package com.javalab.inheritance.exam08;

public class PersonMain { // class s

	public static void main(String[] args) { // main s

//		Person student = new Student();
//		Person professor = new Professor();

		// raw data를 가공해서 저장할 부모 타입 Array 선언
		Person[] person = new Person[5];

		person[0] = new Student("김보희", 20, "alice@example.com", "72345678", "컴퓨터공학과");
		person[1] = new Student("미정이", 19, "bob@hotmail.com", "87654321", "문헌정보학과");
		person[2] = new Student("채필립", 22, "marine@google.com", "6587658", "영문학과");
		person[3] = new Professor("김명룡", 45, "charlie@example.com", "13265872", "문헌정보학과");
		person[4] = new Professor("이덕임", 50, "diana@example.com", "23456789", "컴퓨터공학과");

		// 다형성을 이용하여 학생과 교수 정보 출력
		System.out.println("========학생 & 교수========");
		for (int i = 0; i < person.length; i++) {
			person[i].showHumanInfo();
			System.out.println("------------------------");
		}
		System.out.println("========================");
	} // main e

} // class e
