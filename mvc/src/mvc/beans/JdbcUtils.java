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
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws Exception {
		return ds.getConnection();
	}
	
}