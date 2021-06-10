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
		int people = Integer.parseInt(req.getParameter("people"));
		int month = Integer.parseInt(req.getParameter("month"));
		int days = Integer.parseInt(req.getParameter("days"));
		
		int pay = people * days * 100000;
		int sale = 1;
		
		if(month >=3 && month <= 5) {
			sale = 10;
		}
		else if(month >= 6 && month < 8) {
			sale = 5;
		}
		else if(month >= 9 && month < 11) {
			sale = 15;
		}
		else if(month == 12 || month == 1 || month == 2) {
			sale = 20;
		}
		
		pay = pay * (100 - sale) / 100;
		resp.getWriter().println(pay);
	}
	
}
