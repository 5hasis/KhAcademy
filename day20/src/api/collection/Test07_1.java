package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Member> list = new ArrayList<>();
		
		//2.데이터추가
		Member m1 = new Member("master", "master1234");
		Member m2 = new Member("tester", "tester1234");
		Member m3 = new Member("user", "user1234");
		Member m4 = new Member("student", "student1234");
		Member m5 = new Member("manager", "manager1234");
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);

		//3.사용자 정보 설정
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		
		Member user = new Member(id, pwd);
		
		//4.검증 및 출력
		//= contains가 정상작동되기 위해서는 Member 클래스에서 equals와 hashCode의 재정의가 필요
		//= 구조를 바꿔버리는 것이기 때문에 신중하게 사용하여야 한다
		if(list.contains(user)) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
		
		sc.close();
		
	}
}
