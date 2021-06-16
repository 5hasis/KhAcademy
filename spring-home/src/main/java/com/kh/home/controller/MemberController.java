package com.kh.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.home.entity.MemberDto;
import com.kh.home.repository.MemberDao;

@Controller
//공용 주소 설정. GetMapping, PostMapping 사용 불가
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberDao memberDao;
	
	//회원 가입 관련 요청 처리
	@GetMapping("/regist")
	public String regist() {
		return "member/regist";
	}
	
	@PostMapping("/regist")
	public String regist(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "redirect:regist_success"; //root로 이동(context path 생략)
	}
	
	@GetMapping("/regist_success")
	public String registSuccess() {
		return "member/registSuccess";
	}
	
}
