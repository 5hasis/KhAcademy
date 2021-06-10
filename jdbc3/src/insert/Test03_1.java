package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Q : 아이디가 중복될 경우 발생하는 예외와 해결책.
//		A : java.sql.SQLIntegrityConstraintViolationException 발생, try~catch로 처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String characterId = sc.next();
		sc.close();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");//ojdbc8.jar 등록된 경우만 가능
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
			String sql = "insert into character(character_no, character_name) "
							+ "values(character_seq.nextval, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, characterId);
			ps.execute();
			
			con.close();
			System.out.println("아이디 생성 완료");
		}
		catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("아이디가 이미 사용중입니다");
		}
		
	}
}