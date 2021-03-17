package oop.modifier1;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Student a = new Student();
		
		a.set("피카츄:", 50, 80);
		//a.name = "피카츄"; //변수에 직접 접근X (private)
		
		System.out.println(a.getName());

	}

}
