package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ItemDao;
import study.beans.ItemDto;

@WebServlet(urlPatterns = "/jsp/itemEdit.kh")
public class ItemEditServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//준비 : 아이템 정보(번호,이름,가격)
			req.setCharacterEncoding("UTF-8");//복원 코드
			ItemDto itemDto = new ItemDto();
			itemDto.setItemNo(Integer.parseInt(req.getParameter("itemNo")));
			itemDto.setItemName(req.getParameter("itemName"));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("itemPrice")));
			
			//계산
			ItemDao itemDao = new ItemDao();
			itemDao.edit(itemDto);
			
			//출력
			//resp.sendRedirect("/study/jsp/itemDetail.jsp?itemNo="+itemDto.getItemNo());
			resp.sendRedirect("itemDetail.jsp?itemNo="+itemDto.getItemNo());
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}