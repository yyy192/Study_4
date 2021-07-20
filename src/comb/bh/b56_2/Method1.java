package comb.bh.b56_2;

import java.util.Scanner;

public class Method1 {
	//class내에 여러개의 main 선언 가능함
	//설계도
	
	//접근지정자 그외지정자 리턴타입 메서드명(매개변수선언) {}
	//public  static  void  main (String[] args){}

	//접근지정자는 모르나 확신이 없으면 public
	//그외지정자는 모르거나 확신이 없으면 쓰지마
	//리턴타입은 모르거나 확신이 없으면 무조건 void
	//매개변수는 모르거나 확신이 없으면 쓰지마
	//prn 선언
	public void prn() {
		//print if for
		System.out.println("prn method 실행");
		
	}
	//prn2 선언
	//hello world 3번 출력
	public void prn2() {
		int num = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력받으세요.");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.println("HELLO WORLD");
		}
		System.out.println(num);
	}
	
	//prn3 선언
	public void prn3() {
		System.out.println("HELLO WORLD");
	}
	
	//prn4 선언
	public void prn4(int num) {
		
		for(int i=0;i<num;i++) {
			System.out.println("Hello World");
		}
	}
	

}
