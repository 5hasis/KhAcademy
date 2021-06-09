package module;

import beans.ProductDao;

public class Test05 {
	public static void main(String[] args) throws Exception {
		
		String name = "빼빼로";
		String type = "과자";
		int price = 1200;
		String made = "2021-04-16";
		String expire = "2021-06-16";
		
		ProductDao productDao = new ProductDao();
		productDao.registItem(name, type, price, made, expire);
		
		System.out.println("등록 완료");
	}

}
