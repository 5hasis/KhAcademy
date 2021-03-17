package oop.method4;

//호텔 객실 클래스 : 객체 생성을 위한 도구
public class Hotel {
	String name;
	int people;
	int low;
	int semiPeak;
	int peak;

	//멤버 메소드 : 객체의 기능
	void set(String name, int people, int low, int semiPeak, int peak) {
		this.setName(name);
		this.setPeople(people);
		this.setLow(low);
		this.setSemiPeak(semiPeak);
		this.setPeak(peak);
	}

	void setName(String name) {
		this.name = name;
	}

	void setPeople(int people) {
		//(1)
		//if (people >= 2)
			//this.people = people;
		
		//(2)
		if(people < 2)
			return;
		this.people = people;
	}

	void setLow(int low) {
		if (low > 0)
			this.low = low;
	}

	void setSemiPeak(int semiPeak) {
		if (semiPeak > 0)
			this.semiPeak = semiPeak;
	}

	void setPeak(int peak) {
		if (peak > 0)
			this.peak = peak;
	}

	void out() {
		
		System.out.println("<객실 정보>");
		System.out.println("객실명 : " + this.name);
		System.out.println("인원 : " + this.people + "명");
		System.out.println("준성수기요금 : " + this.semiPeak + "원");
		System.out.println("성수기요금 : " + this.peak + "원");
	}
	
	//평균요금을 반환(return)하는 메소드를 구현하면 어떨까?
	//=getter 메소드
	int getAverage() {
		return (this.low + this.semiPeak + this.peak) / 3;
	}
}
