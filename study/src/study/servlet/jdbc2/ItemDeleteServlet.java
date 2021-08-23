package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;

@WebServlet(urlPatterns = "/jsp/itemDelete.kh")
public class ItemDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비 : 상품번호를 수신
			int itemNo = Integer.parseInt(req.getParameter("itemNo"));
			
			//계산
			ItemDao itemDao = new ItemDao();
			boolean result = itemDao.delete(itemNo);
			
			//출력 : 목록 페이지로 Redirect 처리
			//resp.sendRedirect("/study/jsp/itemList.jsp");//절대경로
			resp.sendRedirect("itemList.jsp");//상대경로
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}