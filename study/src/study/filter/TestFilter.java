package study.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *	필터(Filter)
 *	- 사용자의 요청을 접수하기 전에 검사할 수 있는 도구
 *	- 서블릿과 함께 자바웹에서 제공하는 요청 처리 도구
 *	- 필요하다면 요청을 중간에 검사하여 올바르지 않을 경우 차단 또는 다른곳으로 이동 처리가 가능
 *
 * 생성방법 : 서블릿과 유사
 * 1. javax.servlet.Filter 를 상속받는다
 * 2. 주소를 등록한다
 * 		- 주소는 신규로 만드는 것이 아니라 만들어져 있는 주소를 설정해야 한다
 * 3. 메소드를 재정의하고 원하는 코드를 작성한다(doFilter 메소드)
 * 		- ServletRequest : HttpServletRequest의 상위 형태.
 * 		- ServletResponse : HttpServletResponse의 상위 형태.
 * 		- FilterChain : 사용자가 요청한 대상까지 이동하는 경로에 존재하는 대상들의 정보를 가진 객체(네비게이션)
 * 		- 기본적으로 아무 코드도 작성하지 않으면 해당 페이지는 차단된다.
 * 		- 통과 코드 : chain.doFilter(request, response);
 */

@WebFilter(urlPatterns = "/jsp/memberList.jsp")
public class TestFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//서블릿과 같이 코드를 작성하고 싶다면 다운캐스팅을 해야 한다
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		
		System.out.println("필터가 실행되었습니다");
		chain.doFilter(request, response);
	}
}

