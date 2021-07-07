package com.kh.spring22;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 *	Spring boot에서 web.xml 역할을 수행하는 클래스
 *	프로젝트 생성 시 배포 형태를 war로 선택했을 때만 나온다.
 *	= legacy의 web.xml 대신 이곳에 설정을 수행(자바코드)
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Spring22BootApplication.class);
	}

}
