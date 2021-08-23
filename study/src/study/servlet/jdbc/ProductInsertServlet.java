package study.servlet.jdbc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ProductDao;
import study.beans.ProductDto;

@WebServlet(urlPatterns = "/product/insert.kh")
public class ProductInsertServlet extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			
			ProductDto productDto = new ProductDto();
			productDto.setName(req.getParameter("name"));
			productDto.setType(req.getParameter("type"));
			productDto.setType(req.getParameter("price"));
			productDto.setType(req.getParameter("made"));
			
			ProductDao productDao = new ProductDao();
			productDao.registItem(productDto);
			
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("정보등록이 완료되었습니다.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}

	}

}
