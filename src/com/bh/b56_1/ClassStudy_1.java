package com.bh.b56_1;

public class ClassStudy_1 {

	public static void main(String[] args) {
		// 메인 메서드의 용도는 프로그램을 시작하는 용도
		// 또는 메서드 테스트 용도
		
		System.out.println("ClassStudy_1 Start");
		// 학생 1명 생성 - Object
		// class명(데이터타입) (참조)변수명 = new class명();
		Student st = new Student();
		
		Student st2 = new Student();

		//주소출력
		System.out.println(st); 
		System.out.println(st2);
		
		System.out.println(st == st2); //st와 st2 주소는 다름 ->false

		
		// 멤버의 접근(사용)
		// 참조_변수명.멤버_변수명
		st.name = "변백현"; //데이터타입 = string타입
		st.num = 22;
		st.kor = 30;
		st.eng = 40;
		st.math = 45;
		
		System.out.println(st.name); //변백현
		
		//st의 총점을 계산해서 입력하고 출력하기
		
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total/3.0;
		System.out.println("총 점 = "+st.total);
		System.out.println("평 균 = "+st.avg);
		
		st2.num = 22;
		System.out.println(st.num == st2.num); //값을 비교함 ->true

		st2 = st; //st2는 Student타입이라 같은 Student타입인 st를 넣을 수 있음.
		System.out.println(st2.name);//변백현
		System.out.println("ClassStudy_1 Finish");

	}

}
