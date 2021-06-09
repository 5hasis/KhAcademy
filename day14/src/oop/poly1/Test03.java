package oop.poly1;

public class Test03 {
	public static void main(String[] args) {
		//배열을 이용하여 갤럭시21s 5개와 , 아이폰12 5개를 보관시켜보세요
		//= 정적 타입으로 보면 갤럭시21s 배열과 아이폰12 배열이 각각 필요하다
		//= 동적 타입으로 보면 Phone 배열 10칸만 있으면 가능하다
		
		Phone[] p = new Phone[10];
		
		for(int i=0; i < p.length; i++) {
			if(i % 2 != 0) {
				p[i] = new Galaxy21S();
			}
			else {
				p[i] = new IPhone12();
			}
		}
		
		for(int i=0; i < p.length; i++) {
			//System.out.println(p[i]);
			p[i].call();
		}
		
		
	}
}