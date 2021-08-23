package com.kh.spring06;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//주의 : 반드시 Servlet이 3.1 이상의 버전을 가져야 한다(미만은 테스트 불가)
//목표 : Spring과 연동된 ItemController의 /insert[POST] 를 테스트
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test09 {
	
	//컨트롤러와 기타 컴포넌트를 연동하기 위해서는 반드시 다음 도구가 필요
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mock;
	
	@Before
	public void before() {
//		mock = MockMvcBuilders.standaloneSetup(new ItemController()).build();
		mock = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void test() throws Exception {
		mock
			.perform(
					post("/insert")
						.param("itemName", "테스트이름")//파라미터1
						.param("itemPrice", "50000")//파라미터2
			)//요청 정보(주소,방식,파라미터)
			.andDo(print())//요청 후 할일
//			.andExpect(status().is(302));
			.andExpect(status().is3xxRedirection());
	}
	
	

}

