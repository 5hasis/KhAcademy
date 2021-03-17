package oop.basic3;

public class Test01 {
	public static void main(String[] args) {
		//객체(선수) 생성
		Player a = new Player();
		Player b = new Player();
		Player c = new Player();
		
		//초기화
		
		//a를 주인공으로 set 코드를 실행하는데 5개의 데이터를 준비물로 전달한다!
		a.set("김연아", "피겨스케이팅", 2, 0, 1);
		
		//b를 주인공으로 set 코드를 실행하는데 5개의 데이터를 준비물로 전달한다!
		b.set("이상화", "스피드스케이팅", 1, 2, 1);
		
		//c를 주인공으로 set 코드를 실행하는데 5개의 데이터를 준비물로 전달한다!
		c.set("윤성빈", "스켈레톤", 1, 0, 1);
		
		//출력
		//a를 주인공으로 해서 result() 안의 코드를 실행해라!
		a.result();
		
		//b를 주인공으로 해서 result() 안의 코드를 실행해라!
		b.result();
		
		//c를 주인공으로 해서 result() 안의 코드를 실행해라!
		c.result();
	}
}