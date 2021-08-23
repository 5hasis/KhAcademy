package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.MemberDao;
import study.beans.MemberDto;

@WebServlet(urlPatterns = "/member/insert.kh")
public class MemberInsertServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
//			준비 : 가입에 필요한 정보를 수신
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(req.getParameter("memberId"));
			memberDto.setMemberPw(req.getParameter("memberPw"));
			memberDto.setMemberNick(req.getParameter("memberNick"));
			memberDto.setMemberBirth(req.getParameter("memberBirth"));
			memberDto.setMemberPhone(req.getParameter("memberPhone"));
			memberDto.setMemberEmail(req.getParameter("memberEmail"));
			
			MemberDao memberDao = new MemberDao();
			memberDao.regist(memberDto);
			
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("가입이 완료되었습니다.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
		
	}
}
