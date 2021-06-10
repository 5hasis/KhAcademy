package study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/param.kh")
public class ParameterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		요청 객체(req)를 이용하여 데이터 수신
//		= 사용자가 보낸 데이터(파라미터) 수신 코드
//		= 주의 : 파라미터는 어떠한 경우에도 String 형태로 전달됨. 변환은 self
		
		String q = req.getParameter("q");
//		int r = req.getParameter("r");//불가능
		int r = Integer.parseInt(req.getParameter("r"));
		
		resp.getWriter().println("q = " + q);
		resp.getWriter().println("r = " + r);
	}
}
