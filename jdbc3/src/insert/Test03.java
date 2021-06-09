package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String character_id = sc.next();
		sc.close();
		
		
		Class.forName("oracle.jdbc.OracleDriver"); //ojdbc8.jar
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");
		
		String sql = "insert into chracter(character_no, character_name) values(character_seq,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1,character_id);
//		ps.setInt(2,character_level);
//		ps.setInt(3,character_money);
		
		ps.execute();
		
		con.close();
				
		
	}

}
