package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Q. academy 테이블의 데이터 수정
		
//		준비물 : 번호, 이름
		int academy_no = 10;
		String academy_name = "도쿄점";
		
//		데이터베이스 수정 구문
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "update academy set academy_name = ? where academy_no = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, academy_name);
		ps.setInt(2, academy_no);
//		ps.execute();
		
		int count = ps.executeUpdate(); //실행한 뒤, 적용된 행 수를 반환
		
		con.close();
		
		System.out.println("결과 행 수  : " + count);
		if(count > 0) {
			System.out.println(count + "개 데이터가 수정되었습니다");
		}
		else {
			System.out.println("해당 지점이 존재하지 않습니다.");
		}
		
	}

}
