package api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//ArrayList 배우기
		//=배열과 유사한 형태의 저장소
		//=크기는 가변적
		//-저장소는 무엇이 들어가느냐가 매우 중요
		
		ArrayList a = new ArrayList(); 
		//내용물이 어떤 형태인지 알 수가 없음(Object로 간주) -> 아무거나
		ArrayList<String> b = new ArrayList<String>(); 
		//내용물이 String임을 명시(Generic Type)
		
		ArrayList<String> c = new ArrayList<>(); //오른쪽 Generic type은 생략 가능
		List<String> d = new ArrayList<>(); //업-캐스팅(up-casting)//		추가
		
//		d.add(100);//데이터가 Generic type과 일치하지 않아서 추가 불가
		d.add("아이유");//d[0] = "아이유";
		d.add("송중기");//d[1] = "송중기";
		d.add("유재석");//d[2] = "유재석";
		
//		추출
		System.out.println(d.get(0));//d[0]
		System.out.println(d.get(1));//d[1]
		System.out.println(d.get(2));//d[2]
//		System.out.println(d.get(3));//d[3].. 범위초과
		
//		개수확인
		System.out.println(d.size());//d.length와 유사
		
//		탐색 : 문자열과 비슷
//		= 저장소에 아이유가 있나요?
		System.out.println(d.contains("아이유"));
//		= 저장소에 아이유가 어디 있나요?
		System.out.println(d.indexOf("아이유"));
		
//		삭제
//		= 유재석을 삭제하세요
		d.remove("유재석");
//		= 1번 위치를 삭제하세요(송중기)
		d.remove(1);
		
		System.out.println(d);
		
	}
}

