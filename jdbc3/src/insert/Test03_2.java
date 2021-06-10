package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Test03_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Q : JDBC 코드에서는 commit을 안했는데 왜 commit이 이루어지는가?
//		A : JDBC는 "자동 커밋 모드"를 사용하며, 원한다면 해제할 수 있음
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String characterId = sc.next();
		sc.close();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");//ojdbc8.jar 등록된 경우만 가능
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
			
			//자동 커밋 설정 해제(앞으로 사용하지 않음).
			con.setAutoCommit(false);
			
			String sql = "insert into character(character_no, character_name) "
							+ "values(character_seq.nextval, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, characterId);
			ps.execute();
			
			//커밋,롤백 선택 가능
			//con.commit();//커밋
			con.rollback();//롤백
			
			con.close();
			System.out.println("아이디 생성 완료");
		}
		catch(SQLIntegrityConstraintViolationException e) {
			System.out.println("아이디가 이미 사용중입니다");
		}
		
	}
}