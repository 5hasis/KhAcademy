package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		Class.forName("oracle.jdbc.driver.OracleDriver"); //옛날
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("드라이버 설치 성공!");
		
//		연결 코드
//		= 연결을 위해서는 정보 3개 필요
//		= 아이디, 비밀번호, 주소(IP + Port + SID)
//		DriverManager.getConnection("주소","아이디", "비밀번호");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe","study", "study");
		System.out.println("DB 연결 성공");
		
//		연결 종료
		con.close();
		System.out.println("DB 연결 종료");
	}
}
