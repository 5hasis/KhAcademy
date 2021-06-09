package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 입력 : ");
		String keyword = sc.next();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		//like
		String sql = "select * from product where name like '%'||?||'%' order by asc";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,keyword);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getInt("no"));
			System.out.print("/");
			System.out.print(rs.getString("name"));
			System.out.print("/");
			System.out.print(rs.getString("price"));
		}
		
		
		con.close();
	}
}
