package home.servlet.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.ProductDao;

@WebServlet(urlPatterns="/product/productDelete.kh")
public class ProductDeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int productNo = Integer.parseInt(req.getParameter("productNo"));
			
			ProductDao productDao = new ProductDao();
			productDao.delete(productNo);
			
			resp.sendRedirect("productList.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
