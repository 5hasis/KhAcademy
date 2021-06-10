package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		 정적 SQL 방식의 문제점
//		 1. 작성 불가 글자가 발생(ex : 외따옴표)
//		 String menuName = "돌체'크림'콜드'브루";
//		 2. SQL Injection 공격이 발생할 수 있음.
		String menu_name = "'||(select menu_name from menu where menu_no=3)||'";
		int menu_price = 3000;

//		1.드라이버 설치
		Class.forName("oracle.jdbc.OracleDriver");

//		2.데이터베이스 연결
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

//		3.명령 전송
//		(1) 구문을 저장할 변수를 생성
		String sql = "insert into menu values(menu_seq.nextval, '#1', #2";
		sql = sql.replace("#1", menu_name);
		sql = sql.replace("#2", String.valueOf(menu_price));

//		(2) 구문을 전달 및 실행할 도구를 생성
		PreparedStatement ps = con.prepareStatement(sql);
//		(3) 실행
		ps.execute();

//		4.데이터베이스 종료
		con.close();

		System.out.println("성공!");

	}

}
