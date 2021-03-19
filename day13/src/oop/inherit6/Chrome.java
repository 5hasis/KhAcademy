package oop.inherit6;

public class Chrome extends Browser{
	
	//상위 클래스의 생성자가 정상 작동하도록
	public Chrome(String url, String version) {
		super(url, version); //반드시 생성자의 맨 첫줄에 작성
	}
	
	public void develop() {
		System.out.println("개발자 도구를 실행합니다.");
	}
}
