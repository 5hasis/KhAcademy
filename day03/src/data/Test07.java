package data;

import java.lang.*;

public class Test07 {
	public static void main(String[] args) {
		// 1/N계산기
		int people = 7;
		int price = 200000;
		int perPerson = price / people;
		int remain = price % people;
		
		System.out.println(perPerson);
		System.out.println(remain);
	}

}
