package comb.bh.b56_2;

import java.util.Scanner;

public class Method2 {

	public void t1() {
		System.out.println("void는 리턴이 없을 때");
	}
	
	public String t2() {
		return "Test";
	}
	
	public int t3(int num1, int num2) {
		int num3 =  num1+num2;
		return num3;
	}
	
	public int [] t4() {
		int [] ar = new int[3];
		return ar;
	}
	
	public void t5() {
		int [] ids = {1234, 4567, 8901};
		int [] pws = {5678, 3456, 9876};
		
		Scanner sc = new Scanner(System.in);
	}
	
}
