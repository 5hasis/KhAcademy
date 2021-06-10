package study.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway.kh")
public class SubwayServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//localhost:8080/study/subway.kh?bith=2015
		int birth = Integer.parseInt(req.getParameter("birth"));

		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year - birth + 1;

		int fee;

		if (age >= 65 || age < 8) {
			fee = 0;
		} 
		else if (age >= 20) {
			fee = 1250;
		} 
		else if (age >= 14) {
			fee = 720;
		} 
		else {
			fee = 450;
		}

		resp.setCharacterEncoding("EUC-KR");
		resp.getWriter().println("지하철 요금 : " + fee);
	}

}
