package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test04 {
	public static void main(String[] args) {
//		지역(Locale) 설정
//		= 지역은 고정되어 있기 때문에 미리 만들어진 상수 객체를 사용한다(public static final)
		
		Date d = new Date();
		
		Format f = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss", Locale.JAPAN);
		
		System.out.println(f.format(d));
	}
}