package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select * from member where member_id = ? and member_pw = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pwd);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getString("member_id"));
			System.out.print("/");
			System.out.print(rs.getString("member_nick"));
			System.out.print("/");
			System.out.print(rs.getString("member_grade"));
			System.out.print("/");
			System.out.println(rs.getString("member_point"));
		}
		
		else {
			System.out.println("일치하는 로그인 정보가 없습니다.");
		}
		
		
		
	}
}

