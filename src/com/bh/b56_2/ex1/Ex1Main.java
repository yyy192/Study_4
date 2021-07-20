package com.bh.b56_2.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("시작");

		Scanner sc = new Scanner(System.in);
		//Phone java program으로 표현
		//제조사, 브랜드, 색깔, 크기, 가격
		//1. 핸드폰 class 정의(선언)
		//2. main method에서 핸드폰 생성(객체 생성)하고 데이터입력
		//3. 핸드폰의 정보를 출력
		//4. PhoneView 클래스 선언
		//   view메서드 선언
		//   Phone의 정보를 출력하는 메서드
		//5. 2번에서 생성한 핸드폰의 정보를 view메서드를 호출해서 출력
		
		Phone ph = new Phone();
		PhoneView phv = new PhoneView();
	
		ph.made = "SAMSUNG";
		ph.brand = "GALAXY";
		ph.color = "WHITE";
		ph.size = 10;
		ph.price = 1000000;
		
		Phone ph2 = new Phone();
		ph2.made = "APPLE";
		ph2.brand = "IPHONE";
		ph2.color = "PURPLE";
		ph2.size = 5;
		ph2.price = 1500000;
		
		phv.view(ph);
		
		Phone [] phs = new Phone[2];
		phs[0] = ph;
		phs[1] = ph2;
		
		phv.view2(phs);
//		System.out.println("핸드폰 제조사 = "+ph.made);
//		System.out.println("핸드폰 브랜드 = "+ph.brand);
//		System.out.println("핸드폰 색깔 = "+ph.color);
//		System.out.println("핸드폰 크기 = "+ph.size);
//		System.out.println("핸드폰 가격 = "+ph.price);
		System.out.println("끝");
	}

}
