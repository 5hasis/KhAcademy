package module;

import beans.ProductDao;
import beans.ProductDto;

public class Test05_1 {
	public static void main(String[] args) throws Exception {
		//Q : product에 상품정보를 등록하는 코드를 구현
		
		ProductDto productDto = new ProductDto();
		productDto.setName("스크류바");
		productDto.setType("아이스크림");
		productDto.setPrice(1700);
		productDto.setMade("2021-03-01");
		productDto.setExpire("2021-09-01");
		
		
		ProductDao productDao = new ProductDao();
		productDao.registItem(productDto);
		
		System.out.println("등록 완료");
	}

}
