package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		1.드라이버 설치
		Class.forName("oracle.jdbc.OracleDriver");
		
//		2.데이터베이스 연결
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		3.명령 전송
//		(1) 구문을 저장할 변수를 생성
		String sql = "insert into menu values(menu_seq.nextval, '아메리카노', 1200)";
//		(2) 구문을 전달 및 실행할 도구를 생성
		PreparedStatement ps = con.prepareStatement(sql);
//		(3) 실행
		ps.execute();
		
//		4.데이터베이스 종료
		con.close();
		
		System.out.println("성공!");
		
	}

}
