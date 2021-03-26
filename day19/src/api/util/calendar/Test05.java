package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
	public static void main(String[] args) {
		//수료일(2021년 8월 4일) 77일전 날짜를 계산
		
		//시간 설정
		Calendar c = Calendar.getInstance();
		
		c.set(2021, 7, 4); //2021년 8(-1)월 4일
		
		c.add(Calendar.DATE, -77); //77전으로 이동
		
		//출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(f.format(d));
		
	}
}
