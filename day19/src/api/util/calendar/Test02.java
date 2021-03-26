package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
//		Calendar를 과연 Date로 변경할 수 있는가?
//		= Date로 바꿀 수 있다면 SimpleDateFormat을 쓸 수 있어 출력이 편해진다
		
		Calendar c = Calendar.getInstance();
		
		Date d = c.getTime();
		
		Format f = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss.SSS");
		
		System.out.println(f.format(d));
		
	}
}