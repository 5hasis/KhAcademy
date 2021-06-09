package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("최소 금액 : ");
		int minPrice = sc.nextInt();
		System.out.print("최대 금액 : ");
		int maxPrice = sc.nextInt();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select * from product where price >= ? and price <= ?";
//		String sql = "select * from product price between ? and ? order by asc";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, minPrice);
		ps.setInt(2, maxPrice);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString("name"));
			System.out.print(" - ");
			System.out.println(rs.getString("price"));
		}
		
		con.close();
	}

}
