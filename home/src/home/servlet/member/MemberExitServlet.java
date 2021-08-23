package home.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/exit.kh")
public class MemberExitServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//회원 자신의 번호 -> 파라미터가 아니라 세션을 조회
			int memberNo = (int)req.getSession().getAttribute("memberNo");
			
			//탈퇴 + 로그아웃
			MemberDao memberDao = new MemberDao();
			
			//1.방법1 : 있는 기능으로 구현(조회 후 탈퇴)
//			MemberDto memberDto = memberDao.find(memberNo);
//			memberDao.exit(memberDto.getMemberId(), memberDto.getMemberPw());
			
			//2.방법2 : 신규 기능 생성(PK로 삭제)
			memberDao.exit(memberNo);
			
			req.getSession().removeAttribute("memberNo");
			
			//감사 인사 페이지
			resp.sendRedirect("goodbye.jsp");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
