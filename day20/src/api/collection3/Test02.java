package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//회원가입 프로그램
		
		Map<String, String> db = new HashMap<>();
		//Map<String, String> db = new TreeMap<>();
		
		db.put("master", "master1234");
		db.put("tester", "tester1234");
		db.put("user", "user1234");
		db.put("student", "student1234");
		db.put("manager", "manager1234");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		
		if(db.containsKey(id)) {
			System.out.println("이미 사용중인 아이디 입니다.");
		}
		else {
			db.put(id, pwd);
			System.out.println("회원가입이 완료되었습니다.");
		}
		
		
	}
}
