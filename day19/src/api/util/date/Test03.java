package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		
//		Date 객체 생성
		Date d = new Date();
		
//		Format 객체 생성(SimpleDateFormat)
		Format f1 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		Format f2 = new SimpleDateFormat("y년 M월 d일 E요일");
		Format f3 = new SimpleDateFormat("H시 m분");
		Format f4 = new SimpleDateFormat("a h시 m분 s초 SSS");
		
//		변환 및 출력
		System.out.println(f1.format(d));
		System.out.println(f2.format(d));
		System.out.println(f3.format(d));
		System.out.println(f4.format(d));
		
	}
}