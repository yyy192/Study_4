package com.bh.b56_4;

public class Car {
	
	static String company = "현대";
	String brand;
	String color;
	int price;
	int gitong;
	
	// 생성자 1 - 기본 : 매개변수가 없음
	public Car() {
		
		this("white"); // 자기자신의 또 다른 생성자 호출
		
	}
	
	//생성자 오버로딩
	//생성자 2 - 매개변수 String color
	public Car(String color) {
//		System.out.println("dd"); 
//		this는 맨 첫 줄에, this 위에 코딩하면 Error!
		
		this(color, 50000000);
		System.out.println("success");
	}
	
	public Car(String color, int price) {
	
		this.brand = "펠리세이드";
		this.color = color;
		this.price = price;
		this.gitong = 7;
	}
	
	
	
	public void info() {
		
		System.out.println("Company : "+Car.company);//this 생략
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Price : "+this.price);
		System.out.println("Gitong : "+this.gitong);
	}

}
