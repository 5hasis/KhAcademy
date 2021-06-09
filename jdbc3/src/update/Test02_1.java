package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select * from product order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getInt("no"));//no라는 컬럼의 값을 출력.
			//System.out.print(rs.getInt(1));//1번째 컬럼의 값을 출력.
			System.out.print("/");
			System.out.print(rs.getString("name"));
			System.out.print("/");
			System.out.print(rs.getString("type"));
			System.out.print("/");
			System.out.print(rs.getInt("price"));
			System.out.print("/");
			System.out.print(rs.getDate("made"));//java.sql.Date 형태로 추출
			System.out.print("/");
			System.out.print(rs.getDate("expire"));
			
			System.out.println();
		}
		
		con.close();
		
		
//		준비물
		Scanner sc = new Scanner(System.in);
		System.out.print("상품번호 : ");
		int no = sc.nextInt();
		System.out.print("판매가 : ");
		int price = sc.nextInt();
		sc.close();
		
//		데이터베이스 수정
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

		sql = "update product set price = ? where no = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, price);
		ps.setInt(2, no);
		int count = ps.executeUpdate();
		
		con.close();
		
//		결과 출력
		if(count > 0) {
			System.out.println("상품 가격이 수정되었습니다");
			
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
			sql = "select * from product where no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("데이터 발견");
				System.out.print(rs.getInt("no"));
				System.out.print("/");
				System.out.print(rs.getString("name"));
				System.out.print("/");
				System.out.print(rs.getString("type"));
				System.out.print("/");
				System.out.print(rs.getInt("price"));
				System.out.print("/");
				System.out.print(rs.getDate("made"));
				System.out.print("/");
				System.out.print(rs.getDate("expire"));
				System.out.println();
			}
			else {
				System.out.println("해당 번호 상품이 없습니다");
			}
			
			con.close();
		}
		else {
			System.out.println("해당 번호의 상품이 존재하지 않습니다");
		}
	}
}
