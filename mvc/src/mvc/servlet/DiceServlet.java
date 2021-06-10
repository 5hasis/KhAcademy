package mvc.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dice.kh")
public class DiceServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//랜덤 생성 코드
			Random r = new Random();
			int dice = r.nextInt(6) + 1;
			
			//데이터 전달 코드
			req.setAttribute("dice", dice);//dice라는 이름으로 dice 안에 있는 값을 첨부
			
			//포워드 코드
			RequestDispatcher dispatcher = 
					req.getRequestDispatcher("/WEB-INF/jsp/dice.jsp");
			dispatcher.forward(req, resp);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}