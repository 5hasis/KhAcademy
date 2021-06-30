package com.kh.spring18;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.spring18.entity.ProductDto;
import com.kh.spring18.repository.ProductDao;
import com.kh.spring18.vo.ProductSearchVO;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
@Slf4j
public class Test01 {

	@Autowired
	private ProductDao productDao;
	
	@Test
	public void test() {
		ProductSearchVO productSearchVO = ProductSearchVO.builder()
															.no(10)
//															.name("오레오")
//															.type("아이스크림")
															.minPrice(2000)
															.maxPrice(5000)
														.build();
		List<ProductDto> list = productDao.search(productSearchVO);
		for(ProductDto productDto : list) {
			log.info(productDto.toString());
		}
	}
	
}