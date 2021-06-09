package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 번호 입력 : ");
		int product_no = sc.nextInt();
		System.out.print("수정할 가격 입력 : ");
		int product_price = sc.nextInt();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "update product set price = ? where no = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, product_price);
		ps.setInt(2, product_no);
				
		int count = ps.executeUpdate();
		
		if(count > 0) {
			System.out.println("상품 가격 수정이 완료되었습니다.");
		}
		else {
			System.out.println("해당 상품번호가 존재하지 않으므로 수정이 불가합니다.");
		}
		
		con.close();
		
	}

}
