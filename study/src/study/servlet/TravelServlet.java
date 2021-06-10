package study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/travel.kh")
public class TravelServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		준비 : 파라미터 수신 코드
		int people = Integer.parseInt(req.getParameter("people"));
		int month = Integer.parseInt(req.getParameter("month"));
		int days = Integer.parseInt(req.getParameter("days"));
		
//		계산
//		1. 할인율 계산
//		int rate = 10 or 5 or 15 or 20;
		int rate;
		if(month / 3 == 1) 			rate = 10;
		else if(month / 3 == 2) 	rate = 5;
		else if(month / 3 == 3) 	rate = 15;
		else 									rate = 20;
		
//		2. 요금계산
//		int price = days * 10만원 * people * 할인율;
		int price = days * 100000 * people  * (100 - rate) / 100;
		
//		출력 : 응답객체를 이용한 출력
		resp.getWriter().println(price);
		
	}
}