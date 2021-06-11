package mvc.servlet.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.beans.ProductDao;
import mvc.beans.ProductDto;

//Insert에서는 입력과 처리로 나눠지기 때문에 입력은 GET, 처리는 POST로 나눠서 수행
@WebServlet(urlPatterns = "/product/productInsert.kh")
public class ProductInsertServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/WEB-INF/jsp/product/productInsertInput.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//데이터 수신 및 데이터베이스 등록
			req.setCharacterEncoding("UTF-8");
			ProductDto productDto = new ProductDto();
			productDto.setName(req.getParameter("name"));
			productDto.setType(req.getParameter("type"));
			productDto.setPrice(Integer.parseInt(req.getParameter("price")));
			productDto.setMade(req.getParameter("made"));
			productDto.setExpire(req.getParameter("expire"));
			
			ProductDao productDao = new ProductDao();
			productDao.registItem(productDto);
			
			//forward가 아니라 작업이 끝났으므로 다른 기능으로 redirect
			resp.sendRedirect("productList.kh");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}

