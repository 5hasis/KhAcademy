package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07 {
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
		
//		System.out.println(list.get(0).getId());
//		System.out.println(list.get(0).getPwd());
		
		//4.검증
		int cnt = 0;
		for(int i = 0; i < list.size(); i++) {
			//Member m = list.get(i);
			//if(id.equals(m.getId())
			if(id.equals(list.get(i).getId()) && pwd.equals(list.get(i).getPwd())) {
				cnt++;
				break; //로그인 성공시 더이상 검사 수행x (성능 향상)
			}
		}
		
		//5.출력
		if(cnt > 0) {
			System.out.println("로그인 성공!");
		}
		else
			System.out.println("로그인 실패!");
		
		
		
		sc.close();
		
	}
}
