package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		//아이디, 비밀번호, 닉네임, 생년월일, 전화번호, 이메일.
		System.out.println("아이디 입력 : ");
		String memberId = sc.next();
		
		System.out.println("비밀번호 입력 : ");
		String memberPwd = sc.next();
		
		System.out.println("닉네임 입력 : ");
		String memberNickname = sc.next();
		
		System.out.println("생년월일 입력 : ");
		String memberBirth = sc.next();
		
		System.out.println("전화번호 입력 : ");
		String memberPhone = sc.next();
		
		System.out.println("이메일 입력 : ");
		String memberEmail = sc.next();
		
		sc.close();
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
			String sql = "insert into member "
					+ "values(member_seq.nextval, ?, ?, ?, ?, ?,sysdate, ?, 0, '일반')";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			ps.setString(2, memberPwd);
			ps.setString(3, memberNickname);
			ps.setString(4, memberBirth);
			ps.setString(5, memberPhone);
			ps.setString(6, memberEmail);
			
			ps.execute();
			
			con.close();
			System.out.println("회원 가입 완료");
		}
		catch(SQLIntegrityConstraintViolationException e){
			System.out.println("이미 사용중인 아이디입니다.");
			System.out.println("이미 사용중인 닉네임입니다.");
//			e.printStackTrace();
			
		}
		
	}

}
