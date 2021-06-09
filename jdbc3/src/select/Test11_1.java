package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test11_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "select * from member where member_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {//아이디가 있는 경우
			String databasePw = rs.getString("member_pw");//결과집합의 member_pw를 추출
			if(pwd.equals(databasePw)) {//비밀번호 일치
				System.out.println("로그인 성공");
			}
			else {//비밀번호 불일치
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		}
		else {//아이디가 없는 경우
			System.out.println("아이디가 존재하지 않습니다");
		}
		
		
		
	}
}

