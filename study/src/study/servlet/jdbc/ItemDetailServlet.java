package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/item/detail.kh")
public class ItemDetailServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			데이터 준비 : 기본키(PK)
			int itemNo = Integer.parseInt(req.getParameter("itemNo"));
			
//			데이터베이스 검색
			ItemDao itemDao = new ItemDao();
			ItemDto itemDto = itemDao.get(itemNo);
			
//			출력
			resp.setCharacterEncoding("MS949");
			if(itemDto == null) {
				resp.getWriter().println("해당 번호의 상품은 존재하지 않습니다");
			}
			else {
				resp.getWriter().println(itemDto);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}