package com.bh.b56_4;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car(); //생성자 호출, 자동차 한 대를 만들었어
		
		Car car2 = new Car("Red");
		
		Car car3 = new Car("Pink", 70000000);

		
		car.info();
		System.out.println(" ");
		car2.info();
		System.out.println(" ");
		car3.info();
	}

}
