package oop.method3;

public class Smartphone {
	String name;
	String telecom;
	int contract;
	int price;

	// 멤버 메소드 : 코드 저장
	// =setter 메소드를 변수 개수만큼
	// =필요한 메소드를 추가

	void setName(String name) {
		this.name = name;
	}

	void setTelecom(String telecom) {
		// 참조형은 '==' 로 비교 X
		// if (telecom == "KT" || telecom == "SK" || telecom == "LG")

		switch (telecom.toUpperCase()) {
		case "SK":
		case "KT":
		case "LG":
			this.telecom = telecom;
		}

	}

	void setContract(int contract) {
		/*
		 * switch(contract) case 24: case 30: case 46:
		 */
		if (contract == 24 || contract == 30 || contract == 36) {
			this.contract = contract;
		}
	}

	// (1)0이상만 설정하도록 setter 메소드 구현
//	void setPrice(int price) {
//		if (price >= 0) {
//			this.price = price;
//		}
//	}

	// (2)0미만은 설정이 안되도록 setter메소드 구현
	void setPrice(int price) {
		if (price < 0) {
			return; // 메소드 중지 키워드
		}
		this.price = price;
	}

	// 추가 메소드
	void set(String name, String telecom, int contract, int price) {
		this.setName(name);
		this.setTelecom(telecom);
		this.setContract(contract);
		this.setPrice(price);
	}

	void out() {

		System.out.println("<스마트폰 판매 정보>");
		System.out.println("휴대폰 이름 : " + this.name);
		System.out.println("통신사 : " + this.telecom);
		System.out.println("약정기간 : " + this.contract + "개월");
		System.out.println("판매가 : " + this.price + "원");

	}
}
