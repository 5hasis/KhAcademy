package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test07_2 {
	public static void main(String[] args) throws Exception{
//		Q : 검색어 하나만이 아닌 분류(항목)까지 선택하여 검색할 수 있는가?
		
//		데이터 준비
		String type = "type";//컬럼명 작성(name, type, ...)
		String keyword = "아이";
		
//		데이터베이스 조회
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
//		통합 SQL구문
//		= 항목도 모르고, 검색어도 모르니까 다 위치홀더(?) 처리해서 구현해본다
//		= 원하는 검색이 이루어지지 않는다
//		= 항목은 동적으로 설정되면 안된다(따옴표가 추가되면 안된다)
//		= 항목은 정적으로 설정해야 한다.
		String sql = "select * from product where instr("+type+", ?) > 0 order by "+type+" asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
			
		while(rs.next()) {
			System.out.print(rs.getInt("no"));
			System.out.print("/");
			System.out.print(rs.getString("name"));
			System.out.print("/");
			System.out.print(rs.getString("type"));
			System.out.print("/");
			System.out.print(rs.getInt("price"));
			System.out.println();
		}
		
		con.close();
		
	}
}
