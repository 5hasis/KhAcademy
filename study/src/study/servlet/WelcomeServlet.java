package study.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿(Servlet) - 웹 페이지의 자격을 갖춘 자바 파일
//1. 웹페이지의 자격을 가지기 위해 특정 클래스를 상속받는다(jakarta.servlet.http.HttpServlet)
//2. 접속할 수 있도록 등록하면서 주소를 부여
//	- 주의 : 접속 기본주소(context path)인 /study를 제외한 나머지를 작성
//	- 주의 : 반드시 시작을 /로 해야 한다 
//3. 접속했을 때 수행해야할 코드 및 화면에 출력할 내용을 작성

@WebServlet(urlPatterns = "/welcome.kh")//접속주소(/study를 제외하고 작성)
public class WelcomeServlet extends HttpServlet{

	@Override 
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//사용자의 화면에 메세지를 출력
		resp.getWriter().println("Welcome~");
	}
	
}