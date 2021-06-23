package com.kh.spring12;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

// Lombok에서 지원하는 자동 로깅 도구 생성 기능을 사용(Lombok 설치 필요)
// 이 클래스에 맞는 로깅 도구를 생성해라
@Slf4j
public class Test02 {
	
	//private static final Logger log = LoggerFactory.getLogger(Test02.class);
	
	@Test
	public void test() {
		log.debug("Debug Message");
	}

}
