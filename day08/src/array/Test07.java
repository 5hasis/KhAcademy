package array;

import java.lang.*;
import java.util.*;

public class Test07 {
	public static void main(String[] args) {
		//문자열 5개를 배열에 저장(입력)
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(name[i]);
		}
	}

}
