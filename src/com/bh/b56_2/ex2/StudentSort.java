package com.bh.b56_2.ex2;

public class StudentSort {
	
	//메서드 sortByAvg
	
	public Student [] sortByAvg(Student [] sts) {
		//성적 내림차순 - 평균기준
//		double bincan;
//		String bincan2;
//		int bincan3;
//		int bincan4;
//		int bincan5;
//		int bincan6;
		for(int idx = 0; idx<(sts.length-1);idx++) {
			for(int i=(idx+1);i<sts.length;i++) {
				if(sts[idx].avg<sts[i].avg) {
//				bincan = sts[idx].avg;
//				sts[idx].avg = sts[i].avg;
//				sts[i].avg = bincan;
//				
//				bincan2 = sts[idx].name;
//				sts[idx].name = sts[i].name;
//				sts[i].name = bincan2;
//				
//				bincan3 = sts[idx].kor;
//				sts[idx].kor = sts[i].kor;
//				sts[i].kor = bincan3;
//				
//				bincan4 = sts[idx].eng;
//				sts[idx].eng = sts[i].eng;
//				sts[i].eng = bincan4;
//				
//				bincan5 = sts[idx].math;
//				sts[idx].math = sts[i].math;
//				sts[i].math = bincan5;
//				
//				bincan6 = sts[idx].total;
//				sts[idx].total = sts[i].total;
//				sts[i].total = bincan6;
				Student tmp = sts[idx];
				sts[idx] = sts[i];
				sts[i] = tmp;
				}
			}
		} //바깥 for 끝
		
		return sts;
	}

}
