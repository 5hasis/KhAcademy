package api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {
		//Student를 저장할 수 있는 List 생성
		//= Generic type이 Student인 List 생성
		List<Student> list = new ArrayList<>();
		
//		list.add("홍길동");
//		list.add(100);
//		list.add("홍길동", 100);
		
		Student a = new Student("홍길동", 100);
		list.add(a);
		
		list.add(new Student("피카츄", 80));
		
		System.out.println(list.size());
		
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getScore());
		
		Student s = list.get(1);
		System.out.println(s.getName());
		System.out.println(s.getScore());
	}
}