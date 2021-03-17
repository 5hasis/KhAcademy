package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		//객체(선수) 생성
		Player a = new Player();
		Player b = new Player();
		Player c = new Player();
		
		//초기화
		a.name = "김연아";
		a.sport = "피겨스케이팅";
		a.gold = 2;
		a.silver = 0;
		a.bronze = 1;
		
		b.name = "이상화";
		b.sport = "스피드스케이팅";
		b.gold = 1;
		b.silver = 2;
		b.bronze = 1;
		
		c.name = "윤성빈";
		c.sport = "스켈레톤";
		c.gold = 1;
		c.silver = 0;
		c.bronze = 1;
		
		//출력
		System.out.println(a.name);
		System.out.println(a.sport);
		System.out.println(a.gold);
		System.out.println(a.silver);
		System.out.println(a.bronze);
		
		System.out.println(b.name);
		System.out.println(b.sport);
		System.out.println(b.gold);
		System.out.println(b.silver);
		System.out.println(b.bronze);
		
		System.out.println(c.name);
		System.out.println(c.sport);
		System.out.println(c.gold);
		System.out.println(c.silver);
		System.out.println(c.bronze);
	}
}