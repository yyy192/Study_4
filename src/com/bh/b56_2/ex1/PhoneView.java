package com.bh.b56_2.ex1;

public class PhoneView {
	
	
	public void view(Phone ph) {
		
		System.out.println(ph.made);
		System.out.println(ph.brand);
		System.out.println(ph.color);
		System.out.println(ph.size);
		System.out.println(ph.price);	
	}
	
	//핸드폰의 합계금액을 계산해서 출력, 매개변수는 하나만 선언
	public void view2(Phone [] phs) {
		int total = 0;
		for(int i=0;i<phs.length;i++) {
			total = total+phs[i].price;
		}
		System.out.println("핸드폰 합계금액 = "+total);
	}
}
