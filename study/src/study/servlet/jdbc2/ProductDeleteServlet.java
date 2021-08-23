package study.servlet.jdbc2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.ProductDao;

@WebServlet(urlPatterns="/jsp/productDelete.kh")
public class ProductDeleteServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			준비 : 기본키정보
			int no = Integer.parseInt(req.getParameter("no"));
			
//			계산 : 삭제
			ProductDao productDao = new ProductDao();
			boolean result = productDao.delete(no);
			
//			출력 : 성공과 실패로 나누어서 각각 다른 페이지로 전달
			if(result) {
//				resp.sendRedirect("http://localhost:8080/study/jsp/productDeleteSuccess.jsp");
				resp.sendRedirect("/study/jsp/productDeleteSuccess.jsp");
			}
			else {
//				resp.sendRedirect("http://localhost:8080/study/jsp/productDeleteFail.jsp");
				resp.sendRedirect("/study/jsp/productDeleteFail.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	

}
