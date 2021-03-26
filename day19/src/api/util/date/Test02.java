package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
//		시간을 원하는 형식(Format)으로 출력
		
//		시간 구하기
		Date a = new Date();
		
		System.out.println(a);
		
//		1. 정보를 직접 불러와서 시간을 조립해서 생성
		int year = 1900 + a.getYear();
		int month = 1 + a.getMonth(); //0-11로 관리, +1 해줘야함
		int day = a.getDate(); 
		//a.getDay() : 요일이 숫자로 나옴
		
		
		//문자열 덧셈은 StringBuffer 사용한다고 했었음
		StringBuffer buffer = new StringBuffer();
		buffer.append(year);
		buffer.append("-");
		if(month < 10) {
			buffer.append(0);
		}
		buffer.append(month);
		buffer.append("-");
		if(day < 10) {
			buffer.append(0);
		}
		buffer.append(day);
		
		String time = buffer.toString();
		System.out.println(time);
		
//		2. 형식 변환 객체를 만들어서 변환하도록 지시
//		= java.text 패키지에 형식 변환과 관련된 클래스들이 모여있다 (~Format)
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Format fmt = new SimpleDateFormat("yyyy-MM-dd"); //업캐스팅
		
		time = fmt.format(a);
		System.out.println(time);
	}
}
