package com.bh.b56_3;

public class Test2 {

//	오류 나는 이유 타입 t1과 매개변수 2개 타입 두개 다 int로 동일
//	public void t1(int n2, int n1) {
//		
//	}
	
	
	public void t1(int n1, int n2) {
		
		System.out.println(n1+n2);
		
	}
	
	public void t1(int n1, double n2) {
		System.out.println(n1+n2);
	}

}
