package com.bh.b56_3;


public class b56_3Main {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		int num = 1;
		
		t1.num = 3;
		t1.num2 = 5;
		
		t2.num = 900;
		t2.num2 = 2;
		
		t1.info();
		t2.info();
		t2.info3(num);
		
		System.out.println("T1 : "+t1); //주소
		//t1.info();		
		System.out.println("T2 : "+t2);
		//t2.info2();

	}

}
