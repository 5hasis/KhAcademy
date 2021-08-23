package com.kh.spring21;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.spring21.entity.ProductDto;
import com.kh.spring21.repository.ProductDao;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
@Slf4j
public class Test09 {

	@Autowired
	private ProductDao productDao;
	
	@Test
	public void test() {
		int[] no = {2, 3, 4, 5, 6};
		List<ProductDto> list = productDao.list(no);
		for(ProductDto productDto : list) {
			log.debug("dto = {}", productDto);
		}
		
		assertNotEquals(0, list.size());//없으면 에러!
	}
	
}


