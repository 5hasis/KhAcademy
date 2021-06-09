package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		//아이디, 비밀번호, 닉네임, 생년월일, 전화번호, 이메일
		System.out.println("아이디 입력 : ");
		String memberId = sc.next();
		if(!Pattern.matches("^\\w{8,20}$", memberId)) {
			System.out.println("아이디는 영문소문자,대문자,숫자,-,_,로 구성된 8~20자로 입력하세요");
			System.exit(-1); //이상 종료
		}
		
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
		
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "insert into member "
				+ "values(member_seq.nextval,?,?,?,?,?,sysdate, ?,0,'일반')";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberId);
		ps.setString(2, memberPwd);
		ps.setString(3, memberNickname);
		ps.setString(4, memberBirth);
		ps.setString(5, memberPhone);
		ps.setString(6, memberEmail);
		
		ps.execute();
		
		con.close();
		
	}

}
