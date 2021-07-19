package com.bh.b56_1;

public class ClassStudy_1 {

	public static void main(String[] args) {
		// 메인 메서드의 용도는 프로그램을 시작하는 용도
		// 또는 메서드 테스트 용도
		
		System.out.println("ClassStudy_1 Start");
		// 학생 1명 생성 - Object
		// class명(데이터타입) (참조)변수명 = new class명();
		Student bh = new Student();
		
		Student bh2 = new Student();

		System.out.println(bh);
		System.out.println(bh2);
		
		System.out.println(bh == bh2); //bh와 bh2 주소는 다름

		
		// 멤버의 접근(사용)
		// 참조_변수명.멤버_변수명
		bh.name = "변백현"; //데이터타입 = string타입
		bh.num = 22;
		bh.kor = 30;
		bh.eng = 40;
		bh.math = 45;
		
		System.out.println(bh.name);
		
		//bh의 총점을 계산해서 입력하고 출력하기
		
		bh.total = bh.kor + bh.eng + bh.math;
		bh.avg = bh.total/3.0;
		System.out.println("총 점 = "+bh.total);
		System.out.println("평 균 = "+bh.avg);
		
		bh2.num = 22;
		System.out.println(bh.num == bh2.num); //값을 비교함

		bh2 = bh; //st2는 Student타입이라 같은 Studen타입인 st를 넣을 수 있음.
		System.out.println("ClassStudy_1 Finish");

	}

}
