package mvc.beans;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//데이터베이스 관련된 유용한 작업들을 수행
public class JdbcUtils {
	
	private static DataSource ds;
	static {
		try {
			//1. 자원 탐색 도구를 생성한다(InitialContext)
			Context ctx = new InitialContext();
			//2. 경로를 식으로 알려주고 탐색을 명한다.
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
		}
		catch(Exception e) {
			System.err.println("데이터베이스 연결 실패");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception{
		return ds.getConnection();
	}
	
}