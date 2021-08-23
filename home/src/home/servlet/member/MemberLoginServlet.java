package home.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/login.kh")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비
			req.setCharacterEncoding("UTF-8");
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(req.getParameter("memberId"));
			memberDto.setMemberPw(req.getParameter("memberPw"));
			
			//계산
			MemberDao memberDao = new MemberDao();
			MemberDto find = memberDao.login(memberDto);
			
			//출력
			if(find != null) {//성공
				//로그인 성공 시 세션에 memberNo라는 이름으로 회원번호를 저장
				req.getSession().setAttribute("memberNo", find.getMemberNo());
				
				//resp.sendRedirect("../index.jsp");//상대
				//resp.sendRedirect("../");//상대(welcome page 생략)
				//resp.sendRedirect(req.getContextPath()+"/index.jsp");//절대
				resp.sendRedirect(req.getContextPath());//절대(welcome page 생략)
			}
			else {//실패
				resp.sendRedirect("login.jsp?error");//상대
				//resp.sendRedirect(req.getContextPath()+"/member/login.jsp");//절대
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}

