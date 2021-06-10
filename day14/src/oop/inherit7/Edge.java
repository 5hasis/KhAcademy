package oop.inherit7;

public class Edge extends Browser {

	//하단의 메소드는 오버라이드 되었음을 명시합니다. 이름 바꾸기없음 퉤퉤퉤(어노테이션, annotation)
	@Override
	public void search() {
		System.out.println("Bing 검색엔진을 이용하여 검색을 수행합니다");
	}
	
}