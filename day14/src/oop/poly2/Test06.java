package oop.poly2;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		//마무리
		//1. 갤럭시 10대를 랜덤으로 만들어 보관한 뒤 삼성스토어 기능 실행
		//= 0부터 1까지 = 0부터 2개
		Random r = new Random();
		
		Galaxy[] arr = new Galaxy[10];
		
		for(int i=0; i < arr.length; i++) {
			int choice = r.nextInt(2) + 0;
			if(choice == Phone.GALAXY21S) {
				arr[i] = new Galaxy21S("실버");
			}
			else {
				arr[i] = new GalaxyNote10("실버");
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			arr[i].samsungStore();
		}
		
	}
}