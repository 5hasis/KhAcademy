package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

//목표 : 결제 승인 요청 보내기
//조건 : 이 테스트는 반드시 Test03을 성공시켜야 한다.

//요청 주소 정보
//POST /v1/payment/approve HTTP/1.1
//Host: kapi.kakao.com
//Authorization: KakaoAK {APP_ADMIN_KEY}
//Content-type: application/x-www-form-urlencoded;charset=utf-8
@Slf4j
public class Test04 {
	
	@Test
	public void test() throws URISyntaxException {
		//[1] 요청 도구 생성
		RestTemplate template = new RestTemplate();
		
		//[2] Http Header 생성(ex : 편지봉투)
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "KakaoAK 149921109801e50a1800f0dd0984bd6b");
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//[3] Http Body 생성(ex : 편지내용)
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME");
		body.add("tid", "T2915464349730201826");//결제준비 응답정보에 포함된 TID 항목 값
		body.add("partner_order_id", "866bd8ac-d8e9-4a85-a6fd-10fcf1f72b56");//결제준비 요청정보에 포함된 PARTNER_ORDER_ID 항목 값
		body.add("partner_user_id", "2b3619c9-78d0-4488-b2cc-b86b2e144575");//결제준비 요청정보에 포함된 PARTNER_USER_ID 항목 값
		body.add("pg_token", "75bedc17ea3209191fe1");//결제 성공 시 파라미터로 전달되는 PG_TOKEN 항목 값
		
		//[4] Http Header / Body 합성
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);
		
		//[5] 목적지 주소 작성
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		//[6] 전송
		Map map = template.postForObject(uri, entity, Map.class);//응답 후 JSON 수신
		log.debug("map = {}", map);
	}
}