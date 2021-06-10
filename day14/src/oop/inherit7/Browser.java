package oop.inherit7;

//상위 클래스
public class Browser {

	//메소드 : 재정의를 고려하며 설계
	//= 재정의(override)란 메소드의 내용을 변경하는 것을 말함(메소드 중복 정의)
	
	//1. 페이지 이동 기능
	//= 이 기능은 브라우저마다 차이가 있지 않나요? 에 대한 고민을 해봐야 한다.
	//= 이 기능은 모든 브라우저마다 동일해야 하므로 절대로 변경되면 안된다.
	//= 재정의가 불가능하다
	public final void move() {
		System.out.println("페이지를 이동합니다");
	}
	
	//2. 검색 기능
	//= 크롬은 주소창에 입력하여 검색을 수행하면 구글 검색이 가능
	//= 엣지는 주소창에 입력하여 검색을 수행하면 Bing 검색이 가능
	//= 모든 브라우저는 검색이 있긴 하지만 브라우저마다 어느 검색엔진을 쓰는지가 다름
	//= 재정의가 가능하다
	public void search() {
		System.out.println("검색을 수행합니다");
	}
	
}