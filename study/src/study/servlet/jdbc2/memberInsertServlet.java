package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.MemberDao;
import study.beans.MemberDto;

@WebServlet(urlPatterns="/jsp/memberInsert.kh")
public class memberInsertServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			post 방식으로 전송되는 데이터는 유니코드가 깨져서 전송되므로 복원코드가 필요함
//			- get 방식에서도 에러는 나지 않으므로 모든 수신 코드 전에 작성하는 것을 권장
//			- 작성하지 않으면 유니코드가 전부 깨져서 수신됨 (ex. 꿿쓡훓?)
			req.setCharacterEncoding("UTF-8");
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(req.getParameter("memberId"));
			memberDto.setMemberPw(req.getParameter("memberId"));
			memberDto.setMemberNick(req.getParameter("memberId"));
			memberDto.setMemberBirth(req.getParameter("memberId"));
			memberDto.setMemberEmail(req.getParameter("memberId"));
			memberDto.setMemberPhone(req.getParameter("memberId"));
			
			MemberDao memberDao = new MemberDao();
			memberDao.regist(memberDto);
			
//			resp.sendRedirect("http://localhost:8080/study/memberinsertSuccess.jsp");
			resp.sendRedirect("memberinsertSuccess.jsp");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}

}
