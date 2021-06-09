package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test12 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Q. JDBC를 이용하여 "집계함수" 결과를 가져와 출력할 수 있을까?
//		= count, max, min, avg, sum...
//		= 결과 행이 무조건 1개
//		= 데이터가 있는지 없는지 고려하지 않고 바로 다음 줄로 이동하면 데이터 추출이 가능
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select count(*) 개수 from academy";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		rs.next(); //이동
		
//		System.out.println(rs.getInt("count(*)"));
		System.out.println("개수");
		System.out.println(rs.getInt(1));
		
		
		con.close();
		
	}

}
