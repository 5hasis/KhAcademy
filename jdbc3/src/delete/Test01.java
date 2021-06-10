package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "delete from member where member_id = ? and member_pw = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pwd);
		
		int count = ps.executeUpdate();
		
		if(count > 0) {
			System.out.println("정상적으로 회원 탈퇴되었습니다. ");
		}
		else {
			System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
		
		con.close();
		
	}

}
