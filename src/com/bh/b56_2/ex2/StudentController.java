package com.bh.b56_2.ex2;

import java.util.Scanner;

public class StudentController {
	
	//메서드명 start
	//1. 전체 정보 출력
	//2. 학생의 번호 검색
	//3. 학생 정보 추가 - 학생 한 명을 배열에 추가
	//4. 성적 순서 출력 - 내림차순 정렬
	//5. 프로그램 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentView sv = new StudentView();
		StudentInput si = new StudentInput();
		StudentSort ss = new StudentSort();
		
		System.out.println("학생 수를 입력하세요.");
		int count = sc.nextInt();
		
		//학생을 모을 배열 선언
		Student [] sts = new Student[count];
		//새로운 학생을 모을 배열 선언
		Student [] sts2 = new Student[sts.length+1];
		
		
		//문자열 입력받는 법 -> String 변수명 = sc.next();
		//학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		//총점 평균
		for(int i=0;i<sts.length;i++) {
			
			Student st = si.makeStudent();
			sts [i] = st;
		}
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 전체 정보 출력\t2. 학생의 번호 검색\t3. 학생 정보 추가\t4. 성적 순서 출력\t5. 프로그램 종료");
			int c = sc.nextInt();
			if(c==1) {
				//전체정보출력
				sv.viewAll(sts);
				
			}else if(c==2){
				
				//학생번호검색
				System.out.println("학생 번호를 검색하세요.");
				int s = sc.nextInt();
				
				Student st = null;
				for(int i = 0; i<sts.length;i++) {
					if(sts[i].num==s) {
						st = sts[i];
						break;
					}
				}
				if(st != null) {
					sv.viewOne(st);
				}
			}else if(c==3){
				//학생정보추가 - 학생 한 명을 배열에 추가
				System.out.println("학생 한 명을 추가하세요.");
				System.out.println(" ");

				Student st = si.makeStudent();
				sts2[sts.length] = st;
				
				
				sts = si.addArray(sts, sts2); //인자값
				
			}else if(c==4) {
				System.out.println("성적 순으로 출력하세요.");
				
				Student [] sort = ss.sortByAvg(sts);
				
				sv.viewAll(sort);
				
			}else if(c==5) {
				System.out.println("프로그램을 종료합니다.");
				flag = !flag;
			}else {
				System.out.println("잘못 누르셨습니다. 번호를 다시 입력해주세요.");
			}
		}
	}

}
