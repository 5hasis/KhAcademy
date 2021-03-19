package oop.inherit6;

//모든 브라우저가 가질 수 있는 정보들을 가지는 "상위 클래스"
public class Browser {
	protected String url;
	protected String version;
	
	public Browser(String url, String version) {
		this.url = url;
		this.version = version;
	}
	
	public void move() {
		System.out.println("다른 페이지로 이동합니다.");
	}
	public void refresh() {
		System.out.println("새로고침을 시도합니다.");
	}
	
	
}
