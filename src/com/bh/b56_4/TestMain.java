package com.bh.b56_4;

public class TestMain {

	public static void main(String[] args) {
		Test test = new Test();
		
		System.out.println(test.num);  //0
		System.out.println(test.num2); //22
		System.out.println(test.num3); //3
		System.out.println(test.num4); //44
		System.out.println(test.num5); //0
		
		
		test.setNum5(); //멤버메서드 호출
		System.out.println(test.num5); //5
	}

}
