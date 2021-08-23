package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/jsp/itemInsert2.kh")
public class ItemEditServlet2 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			준비
			req.setCharacterEncoding("UTF-8");
			ItemDto itemDto = new ItemDto();
			itemDto.setItemName(req.getParameter("itemName"));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("itemPrice")));
			
//			계산 : 그냥 등록이 아닌 번호 생성 후 등록하도록 구현
			ItemDao itemDao = new ItemDao();
			int itemNo = itemDao.sequence();
			itemDto.setItemNo(itemNo);
			itemDao.insert2(itemDto);
			
//			출력
			resp.sendRedirect("itemDetail.jsp?itemNo="+itemNo);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
