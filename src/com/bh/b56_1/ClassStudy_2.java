package com.bh.b56_1;

import java.util.Scanner;

public class ClassStudy_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작");
		
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		//학생을 모을 배열 선언
		Student [] sts = new Student[count];
		
		//문자열 입력받는 법 -> String 변수명 = sc.next();
		//학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		//총점 평균
		for(int i=0;i<sts.length;i++) {
			Student sts = new Student;
			System.out.println("학생"+(i+1)+"의 이름");
			sts.name = sc.next();
			System.out.println("학생"+(i+1)+"의 번호");
			sts.num = sc.nextInt();
			System.out.println("학생"+(i+1)+"의 국어점수");
			sts.kor = sc.nextInt();
			System.out.println("학생"+(i+1)+"의 영어점수");
			sts.eng = sc.nextInt();
			System.out.println("학생"+(i+1)+"의 수학점수");
			sts.math = sc.nextInt();
			sts.total = sts.kor+sts.eng+sts.math;
			sts.avg = sts.total/3.0;
		}
		
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
		System.out.println("========================================");
		for(int i=0; i>sts.length;i++) {
			
			System.out.println(" ");
		}
		
		//모든 학생의 정보 출력
		
		System.out.println("끝");
		
	}

}
