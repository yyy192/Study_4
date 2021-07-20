package comb.bh.b56_2;

import java.util.Scanner;

public class MethodMain1 {

	public static void main(String[] args) {
		System.out.println("시작");

		//참조변수 = mth1
		Method1 mth1 = new Method1();
		
		//참조변수명.메서드명();
		//메서드 호출
		mth1.prn();
		
		//prn2 호출
		mth1.prn2();

		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력받으세요.");
		int count = sc.nextInt();
		
		//prn3 호출
//		for(int i=0;i<count;i++) {
//			mth1.prn3();
//		}
		
		mth1.prn4(count); //인자값
		
		System.out.println("끝");

	}

}
