package api.util.calendar;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
		//Calendar 클래스 : 시간 생성 및 계산에 특화된 클래스. Date()와 호환 가능
		
		//Calendar c = new Calendar(); //불가
		Calendar c = Calendar.getInstance();
		
//		System.out.println("c = " + c); //정보가 너무 많이 출력
		
		//필요한 정보만 가져와서 추출(연,월,일,시,분,초,요일)
//		c.get(숫자로 종류를 지정);
		int year = c.get(Calendar.YEAR);
		System.out.println("year = " + year);
		
		//Calendar나 Date는 월을 0-11까지로 표기 (조심!)
		//(12가 1년의 개월 수 라는 의미로 사용되서 일부러 이렇게 설정) 
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month = " + month);
		
		int day = c.get(Calendar.DATE);
//		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("day = " + day);
		
		int hour = c.get(Calendar.HOUR); //12시간(am/pm)
//		int hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour = " + hour);
		
		int minute = c.get(Calendar.MINUTE);
		System.out.println("minute = " + minute);
		
		int second = c.get(Calendar.SECOND);
		System.out.println("second = " + second);
		
		//숫자로 나옴(일요일:1)
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); 
		System.out.println("day of week = " + dayOfWeek);
		
	}
}
