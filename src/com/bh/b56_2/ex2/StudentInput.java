package com.bh.b56_2.ex2;

import java.util.Scanner;

public class StudentInput {
	
	//addArray
	//1. 새로운 배열 생성, 길이는 기존 배열보다 1칸 많게
	//2. 복사
	public Student [] addArray(Student [] sts, Student [] sts2) {
		
		                              
		for(int i=0;i<sts.length;i++) {
			sts2[i]=sts[i];
		}
		sts=sts2;
		return sts;
		
	}
	
	
	//makeStudent
	//학생 한 명 생성
	//이름, 번호, 국어, 영어, 수학 입력받고
	//총점, 평균 계산
	public Student makeStudent() {
		
		Scanner sc = new Scanner(System.in);
		
//		☆정보를 입력받을 참조변수 선언☆
		Student st = new Student();
		
		System.out.println("학생의 이름");
		st.name = sc.next();
		System.out.println("학생의 번호");
		st.num = sc.nextInt();
		System.out.println("학생의 국어점수");
		st.kor = sc.nextInt();
		System.out.println("학생의 영어점수");
		st.eng = sc.nextInt();
		System.out.println("학생의 수학점수");
		st.math = sc.nextInt();
		st.total = st.kor+st.eng+st.math;
		st.avg = st.total/3.0;
		
		return st;
	}

}
