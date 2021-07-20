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
		//새로운 학생을 받을 배열 선언
		Student [] sts2;
		
		//문자열 입력받는 법 -> String 변수명 = sc.next();
		//학생의 수 만큼 정보를 입력 - 이름, 번호, 국어, 영어, 수학
		//총점 평균
		for(int i=0;i<sts.length;i++) {
			
//			☆정보를 입력받을 참조변수 선언☆
			Student st = new Student();
			
			System.out.println("학생"+(i+1)+"의 이름");
			st.name = sc.next();
			System.out.println("학생"+(i+1)+"의 번호");
			st.num = sc.nextInt();
			System.out.println("학생"+(i+1)+"의 국어점수");
			st.kor = sc.nextInt();
			System.out.println("학생"+(i+1)+"의 영어점수");
			st.eng = sc.nextInt();
			System.out.println("학생"+(i+1)+"의 수학점수");
			st.math = sc.nextInt();
			st.total = st.kor+st.eng+st.math;
			st.avg = st.total/3.0;
			sts [i] = st;
		}
		
		//1. 전체 정보 출력
		//2. 학생의 번호 검색
		//3. 학생 정보 추가 - 학생 한 명을 배열에 추가
		//4. 성적 순서 출력 - 내림차순 정렬
		//5. 프로그램 종료
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. 전체 정보 출력\t2. 학생의 번호 검색\t3. 학생 정보 추가\t4. 성적 순서 출력\t5. 프로그램 종료");
			int c = sc.nextInt();
			if(c==1) {
				//전체정보출력
				System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
				System.out.println("========================================================");
				for(int i=0; i<sts.length;i++) {
					
					System.out.print(sts[i].name+"\t");
					System.out.print(sts[i].num+"\t");
					System.out.print(sts[i].kor+"\t");
					System.out.print(sts[i].eng+"\t");
					System.out.print(sts[i].math+"\t");
					System.out.print(sts[i].total+"\t");
					System.out.println(sts[i].avg);
					System.out.println("--------------------------------------------------------");
				}
			}else if(c==2){
				//학생번호검색
				System.out.println("학생 번호를 검색하세요.");
				int s = sc.nextInt();
				
				String a = " ";
		
				for(int i=0;i<sts.length;i++) {
				
					if(s==sts[i].num) {
						System.out.println("이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
						System.out.print(sts[i].name+"\t");
						System.out.print(sts[i].kor+"\t");
						System.out.print(sts[i].eng+"\t");
						System.out.print(sts[i].math);
						System.out.print(sts[i].total+"\t");
						System.out.println(sts[i].avg);
						break;
					}
				}
			}else if(c==3){
				//학생정보추가 - 학생 한 명을 배열에 추가
				System.out.println("학생 한 명을 추가하세요.");
				System.out.println(" ");
				sts2 = new Student[sts.length+1];
				Student st = new Student();
				System.out.println("새로운 학생의 이름");
				st.name = sc.next();
				System.out.println("새로운 학생의 번호");
				st.num = sc.nextInt();
				System.out.println("새로운 학생의 국어점수");
				st.kor = sc.nextInt();
				System.out.println("새로운 학생의 영어점수");
				st.eng = sc.nextInt();
				System.out.println("새로운 학생의 수학점수");
				st.math = sc.nextInt();
				st.total = st.kor +st.eng+st.math;
				st.avg = st.total/3.0;
				sts2[sts.length] = st;
				
				for(int i=0;i<sts.length;i++) {
					sts2[i]=sts[i];
				}
				sts=sts2;
				
			}else if(c==4) {
				//성적 내림차순 - 평균기준
				double bincan;
				String bincan2;
				for(int idx = 0; idx<(sts.length-1);idx++) {
					for(int i=(idx+1);i<sts.length;i++) {
						if(sts[idx].avg<sts[i].avg) {
						bincan = sts[idx].avg;
						sts[idx].avg = sts[i].avg;
						sts[i].avg = bincan;
						
						bincan2 = sts[idx].name;
						sts[idx].name = sts[i].name;
						sts[i].name = bincan2;
						}
					}
				}
				for(int i = 0;i<sts.length;i++) {
					System.out.print("이름 = "+sts[i].name+",\t");
					System.out.println("평균 = "+sts[i].avg);
				}
				
			}else if(c==5) {
				System.out.println("프로그램을 종료합니다.");
				flag = !flag;
				break;
			}else {
				System.out.println("잘못 누르셨습니다. 번호를 다시 입력해주세요.");
			}
		}
		
//		System.out.println("이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
//		System.out.println("========================================");
//		for(int i=0; i<sts.length;i++) {
//			
//			System.out.print(sts[i].name+"\t");
//			System.out.print(sts[i].num+"\t");
//			System.out.print(sts[i].kor+"\t");
//			System.out.print(sts[i].eng+"\t");
//			System.out.print(sts[i].math+"\t");
//			System.out.print(sts[i].total+"\t");
//			System.out.println(sts[i].avg);
//			System.out.println("----------------------------");
//		}
//		
//		//모든 학생의 정보 출력
		
		System.out.println("끝");
		
	}

}
