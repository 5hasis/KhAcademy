package mvc.servlet.item;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.ItemDao;
import mvc.beans.ItemDto;

@WebServlet(urlPatterns = "/item/itemInsert.kh")
public class ItemInsertServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/item/itemInsert.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//데이터 수신 및 데이터베이스 등록
			req.setCharacterEncoding("UTF-8");
			ItemDto itemDto = new ItemDto();
			itemDto.setItemName(req.getParameter("name"));
			itemDto.setItemPrice(Integer.parseInt(req.getParameter("price")));
			
			ItemDao itemDao = new ItemDao();
			itemDao.insert(itemDto);
			
			resp.sendRedirect("https://www.naver.com");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
