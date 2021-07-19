package com.bh.ex1;

public class Ex1Main {
	
	public static void main(String[] args) {
		System.out.println("Ex1Main Start");
		
		//캐릭터 생성(마법사 전사 궁수)
		//이름, 레벨, 체력, 마나, 골드를 입력하고 각각 출력
		Character ch = new Character();
		
		ch.name = "큥아지";
		ch.level = 22;
		ch.hp = 100;
		ch.mp = 56;
		ch.gold = 156; //골드값 입력 안해줬을경우 출력하면 자동 초기화 돼서 값이 0
		
			
//		//ch가 입력 전 초기에 가지고 있는 무기의 이름을 출력
//		System.out.println("초기 무기의 이름 = "+ch.wp.name);//추측 = null
		
		System.out.println("캐릭터 이름 = "+ch.name);
		System.out.println("캐릭터 레벨 = "+ch.level);
		System.out.println("캐릭터 체력 = "+ch.hp);
		System.out.println("캐릭터 마나 = "+ch.mp);
		System.out.println("캐릭터 골드 = "+ch.gold);
		
		System.out.println(" ");//경계선
		
		//이름, 공격력, 공격성공률, 강화 각각 출력
		Weapon wp = new Weapon();
		
		wp.name = "물총";
		wp.demage = 10;
		wp.critical = 0.4;
		wp.upgrade = 1;
		
		ch.wp = wp;
		System.out.println("초기 무기의 이름 = "+ch.wp.name);
		System.out.println(" ");//경계선
		
		//ch가 가지고 있는 무기의 이름을 변경하고 출력
		ch.wp.name = "권총";
		System.out.println("변경된 무기의 이름 = "+ch.wp.name);
		wp.name = "도끼";
		System.out.println("또 변경된 무기의 이름 = "+ch.wp.name);//도끼
		System.out.println(" ");//경계선
		
		System.out.println("무기 이름 = "+wp.name);
		System.out.println("무기 공격력 = "+wp.demage);
		System.out.println("무기 공격 성공률 = "+wp.critical);
		System.out.println("무기 강화 = "+wp.upgrade);
		
		System.out.println(" ");//경계선
		
		//몬스터 생성
		//이름, 레벨, 체력, 마나, 골드 입력하고 각각 출력
		Monster mon = new Monster();
		
		mon.name  = "괴도수만";
		mon.level = 2;
		mon.hp = 50;
		mon.mp = 30;
		mon.gold = 60;
		//몬스터무기
		mon.wp = new Weapon();
		mon.wp.name = "몽둥이";
		mon.wp.demage = 500;
		mon.wp.critical = 10.0;
		mon.wp.upgrade = 60;
		
//		ch = mon;
//		오류나는 이유 = 둘 다 주소타입은 맞지만 서로 다른 class라서 다른 타입이다.
//		ch는 Character타입 mon은 Monster타입
		
		System.out.println("몬스터 이름 = "+mon.name);
		System.out.println("몬스터 레벨 = "+mon.level);
		System.out.println("몬스터 체력 = "+mon.hp);
		System.out.println("몬스터 마나 = "+mon.mp);
		System.out.println("몬스터 골드 = "+mon.gold);

		System.out.println("몬스터 무기 이름 = "+mon.wp.name);
		System.out.println("몬스터 무기 공격력 = "+mon.wp.demage);
		System.out.println("몬스터 무기 공격 성공률 = "+mon.wp.critical);
		System.out.println("몬스터 무기 강화 = "+mon.wp.upgrade);
		System.out.println("==================");
		//몬스터무기를 내 무기로 바꾸기

		ch.wp = mon.wp;
		
		System.out.println("캐릭터 무기 이름 = "+ch.wp.name);
		System.out.println("캐릭터 무기 공격력 = "+ch.wp.demage);
		System.out.println("캐릭터 무기 공격 성공률 = "+ch.wp.critical);
		System.out.println("캐릭터 무기 강화 = "+ch.wp.upgrade);
		System.out.println("==================");
;
		// 새로운 monster 생성 = 값들이 초기화됨
		// 기존 monster 다시 사용할 수 없음.
		mon = new Monster();
		System.out.println(mon.level); //2..? nono 0이 출력.
		System.out.println("Ex1Main Finish");
	}

}
