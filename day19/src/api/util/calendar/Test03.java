package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		//시간 설정
		Calendar c = Calendar.getInstance();
		
		//연도를 2022로 설정하기
		c.set(Calendar.YEAR, 2022);
		//월을 1로 설정하기(보정 필요!)
		c.set(Calendar.MONTH, 0);
		//일을1로 설정하기
		c.set(Calendar.DATE, 1);
		
//		=> 한번에 설정(년,월,일)
		c.set(2022, 0, 1);
		
		//출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss.SSS");
		System.out.println(f.format(d));
		
	}

}
