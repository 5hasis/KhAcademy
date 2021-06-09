package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 사용자에게 번호를 입력받아 product 테이블에서 해당 번호의 상품정보 출력
		// 없으면 없다고 출력.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력 : ");
		int num = sc.nextInt();
		sc.close();

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		String sql = "select * from product where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, num);

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			System.out.println("데이터 발견");
			System.out.print(rs.getInt("no"));
			System.out.print("/");
			System.out.print(rs.getString("name"));
			System.out.println();
		} 
		
		else {
			System.out.println("찾으시는 데이터가 존재하지 않습니다");
		}

		con.close();

	}

}
