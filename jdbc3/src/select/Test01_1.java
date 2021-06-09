package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		R(read) 작업을 JDBC로 진행
//		1. 목록 조회(데이터 여러개)
//		2. 단일 조회(PK/Unique 조회 = 0개 또는 1개)
//		3. 집계함수 조회(sum, max, min, avg, count,... = 무조건 1개)
		
//		목록 조회
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","study","study");
		
		String sql = "select * from academy order by academy_no asc";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
//		ps.execute(); //실행만됨... select에 적합하지 않음.
		ResultSet rs = ps.executeQuery(); //실행 후 결과 집합에 접근할 수 있도록 참조(rs) 제공
		
//		(주의) rs는 Connection(con)이 종료되기 전까지만 사용이 가능하므로 배치 순서에 유의
//		=close() 이후에는 데이터 조회 및 추출 불가능
		while(rs.next()) {
			System.out.println("데이터 발견");
//			rs가 쳐다보고 있는 줄에서 academy_no 컬럼 추출
			System.out.println(rs.getInt("academy_no"));
//			rs가 쳐다보고 있는 줄에서 academy_name 컬럼 추출
			System.out.println(rs.getString("academy_name"));
		}
		
		
		con.close();
		System.out.println("완료!");
		
	}

}
