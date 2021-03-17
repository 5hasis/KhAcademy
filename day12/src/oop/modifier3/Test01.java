package oop.modifier3;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Ski a = new Ski();
		Ski b = new Ski();
		Ski c = new Ski();
		
		//초기화
		a.set("주간권", 900, 1800, 80000, 64000);
		b.set("야간권", 1900, 2200, 60000, 42000);
		c.set("심야권", 2000, 2359, 45000, 32000);
		
		//출력
		a.result();
		b.result();
		c.result();
		
		//Q : 주간권과 야간권중에서 성인요금이 비싼 이용권은 무엇인가요?
		//if(a.adult > c.adult) {
		if(a.getAdult() > c.getAdult()) {
			System.out.println("주간권이 야간권보다 성인요금이 비쌉니다");
		}
		//else if(a.adult < c.adult) {
		else if(a.getAdult() < c.getAdult()) {
			System.out.println("야간권이 주간권보다 성인요금이 비쌉니다");
		}
		else {
			System.out.println("주간권과 야간권은 성인요금이 같습니다");
		}
		
		//Q : 주간권의 이용시간을 출력
		//A : 9시간 또는 9시간 0분
		System.out.println(a.getName() + " : " + (a.getEnd() - a.getStart()) + "분");
		System.out.println(b.getName() + " : " + (b.getEnd() - b.getStart()) + "분");
		System.out.println(c.getName() + " : " + (c.getEnd() - c.getStart()) + "분");
	}
}
