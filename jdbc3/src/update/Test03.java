package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("증정 포인트 입력 : ");
		int point = sc.nextInt();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "update member set member_point = member_point + ? where member_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, point);
		ps.setString(2, id);
		
		int count = ps.executeUpdate();
		
		if(count > 0) {
			System.out.println(id + " 회원에게 " + point + " 포인트 증정이 완료되었습니다.");
		}
		else {
			System.out.println("존재하지 않는 회원입니다.");
		}
		
		con.close();
		
	}

}
