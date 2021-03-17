package oop.basic3;

//선수(Player) 
//= 이름(name : String) + 종목(event : String) + 금(gold : int) + 은(silver : int) + 동(bronze : int)
public class Player {
	//멤버 변수 : 데이터 저장소
	String name, event;
	int gold, silver, bronze;
	
	//멤버 메소드 : 코드 저장소
	//void 이름(매개변수) { 코드 }
	void result() {
		//this : 주인공을 의미하는 키워드
		System.out.println(this.name);
		System.out.println(this.event);
		System.out.println(this.gold);
		System.out.println(this.silver);
		System.out.println(this.bronze);
	}
	
	//5개의 데이터를 받아서 코드를 실행하는 메소드
	void set(String a, String b, int c, int d, int e) {
		this.name = a;
		this.event = b;
		this.gold = c;
		this.silver = d;
		this.bronze = e;
	}
}
