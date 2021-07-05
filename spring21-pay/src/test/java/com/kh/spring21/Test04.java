package com.kh.spring21;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.kh.spring21.vo.KakaoPayApproveVO;

import lombok.extern.slf4j.Slf4j;

//목표 : 결제 승인 요청 보내기
//조건 : 이 테스트는 반드시 Test03을 성공시켜야 실행 가능.

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
		headers.add("Authorization", "KakaoAK 57eb967939a6425801f4006702a31ebc");
		headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		
		//[3] Http Body 생성(ex : 편지내용)
		MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("cid", "TC0ONETIME");
		body.add("tid", "T2915473266082308452");//결제준비 응답정보에 포함된 TID 항목 값
		body.add("partner_order_id", "94442ef9-cabe-4eff-80fe-dc0ef4268c8d");//결제준비 요청정보에 포함된 PARTNER_ORDER_ID 항목 값
		body.add("partner_user_id", "f5d6e955-3341-433b-84b5-12e855c32377");//결제준비 요청정보에 포함된 PARTNER_USER_ID 항목 값
		body.add("pg_token", "12198cf9980142cd568a");//결제 성공 시 파라미터로 전달되는 PG_TOKEN 항목 값
		
		//[4] Http Header / Body 합성	
		HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);
		
		//[5] 목적지 주소 작성
		URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
		
		//[6] 전송
		
		//Map map = template.postForObject(uri, entity, Map.class);//응답 후 JSON 수신
		//log.debug("map = {}", map);
		
		//Q : 카카오 레퍼런스 문서를 보고 결과를 저장할 수 있는 VO 클래스를 생성하여 요청
		//클래스명은 KakaoPayApproveVO 라고 작성.
		//= 내부에는 KakaoPayAmountVO , KakaoPayCardInfoVO 를 포함하도록 구성
		KakaoPayApproveVO approveVO = 
				template.postForObject(uri, entity, KakaoPayApproveVO.class);
		log.debug("approveVO = {}", approveVO);
		
	}
}