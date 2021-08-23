package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns="/jsp/itemInsert.kh")
public class ItemInsertServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
//			준비 : 상품명, 가격 수신 -> 상품 정보
			ItemDto itemDto = new ItemDto();
			itemDto.setItemName(req.getParameter("itemName"));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("itemPrice")));
			
//			계산
			ItemDao itemDao = new ItemDao();
			itemDao.insert(itemDto);
			
//			출력
//			resp.sendRedirect("성공페이지주소");
//			resp.sendRedirect("http://localhost:8080/study/jsp/itemInsertSuccess.jsp"); //절대경로
//			resp.sendRedirect("localhost:8080/study/jsp/itemInsertSuccess.jsp"); //절대경로
//			resp.sendRedirect("/study/jsp/itemInsertSuccess.jsp"); //절대경로
			resp.sendRedirect("itemInsertSuccess.jsp"); //상대경로
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	

}
