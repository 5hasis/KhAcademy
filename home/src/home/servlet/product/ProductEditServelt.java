package home.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.ProductDao;
import home.beans.ProductDto;

@WebServlet(urlPatterns="/product/productEdit.kh")
public class ProductEditServelt extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			ProductDto productDto = new ProductDto();
			productDto.setNo(Integer.parseInt(req.getParameter("productNo")));
			productDto.setName(req.getParameter("productName"));
			productDto.setPrice(Integer.parseInt(req.getParameter("productPrice")));
			productDto.setMade(req.getParameter("productMade"));
			productDto.setExpire(req.getParameter("productExpire"));
			
			ProductDao productDao = new ProductDao();
			productDao.edit(productDto);
			
			resp.sendRedirect("productDetail.jsp?productNo="+productDto.getNo());
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}

}
