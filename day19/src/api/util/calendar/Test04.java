package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		// 시간 설정
		Calendar c = Calendar.getInstance();

		//시간 계산 -> Calendar의 장점
		//7일 뒤는 며칠일까?
		c.add(Calendar.DATE, 7);

		// 출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss.SSS");
		System.out.println(f.format(d));
	}
}
