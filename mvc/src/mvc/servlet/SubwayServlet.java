package mvc.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway.kh")
public class SubwayServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			//계산 및 첨부
			int birth = Integer.parseInt(req.getParameter("birth"));
			
			//나이 계산
			int current = Calendar.getInstance().get(Calendar.YEAR);
			int age = current - birth + 1;
			
			//요금 계산
			//int fare = 1250 or 720 or 450 or 0;
			int fare;
			if(age >= 65 || age < 8) {
				fare = 0;
			}
			else if(age >= 20) {
				fare = 1250;
			}
			else if(age >= 14) {
				fare = 720;
			}
			else {
				fare = 450;
			}
			
			req.setAttribute("age", age);
			req.setAttribute("fare", fare);
			
			//포워드
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/subway.jsp");
			dispatcher.forward(req, resp);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}


