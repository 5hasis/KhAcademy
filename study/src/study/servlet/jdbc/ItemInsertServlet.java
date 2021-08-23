package study.servlet.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/insert.kh")
public class ItemInsertServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		목표 : 데이터베이스(오라클) Insert 코드를 JDBC로 수행
//		1. ojdbc8.jar
//		- 기존 Java Project와 다르게 /WebContent/WEB-INF/lib 폴더에 넣기만 하면 자동 등록
//		2. 데이터베이스 코드 구성
		
		try {
			//String itemName = req.getParameter("itemName");
			//int itemPrice = Integer.parseInt(req.getParameter("itemPrice"));
			
			ItemDto itemDto = new ItemDto();
			itemDto.setItemName(req.getParameter("itemName"));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("itemPrice")));
			
			/*Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "study", "study");

			String sql = "insert into item values(item_seq.nextval, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setInt(2, itemPrice);
			ps.execute();
			
			con.close(); */
		
//			데이터베이스 코드를 DAO 호출 코드로 작성
			ItemDao itemDao = new ItemDao();
			itemDao.insert(itemDto);
			
//			사용자에게 알림
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("item 등록 완료");
		
		}
		catch(Exception e) {
//			오류가 발생했다는 것은 정상적인 진행이 어렵다는 의미이므로 사용자에게 이를 할려야함
			e.printStackTrace(); //개발자가 오류확인을 위한 로그 출력
			resp.sendError(500); //사용자에게 상태번호 500번 오류 전송
		}
	}

}
