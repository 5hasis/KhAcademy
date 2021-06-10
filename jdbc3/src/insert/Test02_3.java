package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02_3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		해결책 : 동적 SQL 생성
//		=값을 구문과 섞이지 않도록 자체적으로 변조하여 전송한 뒤 조립하여 실행(DIY).
		String menu_name ="프라푸치노";
		int menu_price = 4000;
		
		
//		1.드라이버 설치
		Class.forName("oracle.jdbc.OracleDriver");
		
//		2.데이터베이스 연결
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		3.명령 전송
//		(1) 구문을 저장할 변수를 생성
		String sql = "insert into menu values(menu_seq.nextval, ?, ?";
		System.out.println(sql);
		
//		(2) 구문을 전달 및 실행할 도구를 생성
//		=구문의 값 자리(위치 홀더,?)에 연결될 데이터를 지정
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, menu_name); //1번째 위치 홀더에 menu_name을 String형태로 연결(따옴표생성)
		ps.setInt(2, menu_price); //2번째 위치 홀더에 menu_price를 int 형태로 연결(따옴표 생성x)
		
//		(3) 실행
		ps.execute();
		
//		4.데이터베이스 종료
		con.close();
		
		System.out.println("성공!");
		
	}

}
