package home.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/boardEdit.kh")
public class BoardEditServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비 : 파라미터(4개 : 번호, 말머리, 제목, 내용) + 세션(회원번호, 본인글 여부 확인용) --> BoardDto
			req.setCharacterEncoding("UTF-8");
			BoardDto boardDto = new BoardDto();
			boardDto.setBoardNo(Integer.parseInt(req.getParameter("boardNo")));
			boardDto.setBoardHeader(req.getParameter("boardHeader"));
			boardDto.setBoardTitle(req.getParameter("boardTitle"));
			boardDto.setBoardContent(req.getParameter("boardContent"));
			
			//처리 : 
			BoardDao boardDao = new BoardDao();
			boardDao.edit(boardDto);
			
			//출력 : 번호를 첨부하여 상세페이지로 리다이렉트
			resp.sendRedirect("boardDetail.jsp?boardNo="+boardDto.getBoardNo());
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}

