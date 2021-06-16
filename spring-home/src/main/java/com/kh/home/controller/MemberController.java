package com.kh.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//공용 주소 설정. GetMapping, PostMapping 사용 불가
@RequestMapping("/member")
public class MemberController {
	
	//회원 가입 관련 요청 처리
	@GetMapping("/regist")
	public String regist() {
		return "member/regist";
	}
	//@PostMapping("/regist")
	
}
