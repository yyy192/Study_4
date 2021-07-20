package com.bh.b56_2.ex2;

public class StudentView {

	//method명이 viewAll
	//menu에서 1번 눌렀을 때 실행하는 method
	//1. 전체 정보 출력
	public void viewAll(Student [] sts) {
		System.out.println("전체 정보를 출력하세요.");
		System.out.println(" ");
		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
		System.out.println("====================================================");
		for(int i=0; i<sts.length;i++) {
			
			System.out.print(sts[i].name+"\t");
			System.out.print(sts[i].num+"\t");
			System.out.print(sts[i].kor+"\t");
			System.out.print(sts[i].eng+"\t");
			System.out.print(sts[i].math+"\t");
			System.out.print(sts[i].total+"\t");
			System.out.println(sts[i].avg);
			System.out.println("-----------------------------------------------------");
	
		}
	}
	
	//method명이 viewOne
	//menu에서 2번 선택 시 실행하는 method
	//학생 한 명 정보 출력
	
	public void viewOne(Student st) {
		
				System.out.println("이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
				System.out.print(st.name+"\t");
				System.out.print(st.kor+"\t");
				System.out.print(st.eng+"\t");
				System.out.print(st.math+"\t");
				System.out.print(st.total+"\t");
				System.out.println(st.avg);
				System.out.println(" ");
			}
	
}
