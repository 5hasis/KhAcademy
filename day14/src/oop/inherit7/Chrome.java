package oop.inherit7;

public class Chrome extends Browser{
	//상속을 받았기 때문에 메소드 2개가 존재한다
	//= 만약 이 메소드의 내용이 마음에 안들어서 변경하고 싶을 때는 어떻게 해야 하는가?
	//= 같은 형태로 한번 더 만들면 this의 내용이 실행되기 때문에 가려지는 현상이 발상
	//= 메소드 오버라이드(method override)라고 부른다
	
	public void search() {
		System.out.println("구글 검색엔진과 연동하여 검색을 수행합니다");
	}
	
}