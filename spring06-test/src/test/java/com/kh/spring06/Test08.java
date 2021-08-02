package com.kh.spring06;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

//목표 : TestController의 /first mapping이 정상 수행되는지 테스트
//= 아무런 도구와 연결되어 있지 않으므로 독립 컨트롤러 테스트 진행
public class Test08 {
	
	//컨트롤러를 테스트 하려면 가짜 MVC 도구가 필요 : MockMvc
	private MockMvc mock;
	
	@Before
	public void before() {
		mock = MockMvcBuilders.standaloneSetup(new TestController()).build();
	}
	
	@Test
	public void test() throws Exception {
		//mock 객체를 이용하여 우리가 원하는 테스트를 수행
		//= 필요한 정보(주소, 전송방식, 파라미터, ...)를 알려주고
		//= 결과를 얻어와서 화면에 출력
		mock
			.perform(get("/test/first"))//요청 정보(주소,방식,파라미터)
			.andDo(print())//요청 후 할일
//			.andExpect(status().isOk());//예상하는 값(status == ok)
//			.andExpect(status().is(200));//예상하는 값(status == 200)
			.andExpect(status().is2xxSuccessful());//예상하는 값(status == 2xx)
	}
	
}
