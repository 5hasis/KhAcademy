package com.kh.spring17.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.spring17.entity.CertDto;
import com.kh.spring17.service.CertService;

@Controller
public class CertController {
	
	@Autowired
	private CertService certService;
	
	//이메일 입력 페이지
	@GetMapping("/cert1")
	public String cert1() {
		return "cert1";//"/WEB-INF/views/cert1.jsp"
	}
	
//	주의 : Redirect 시 데이터를 추가하고 싶다면 RedirectAttributes 사용을 권장(Model과 동일한 사용법) 
	@PostMapping("/cert1")
	public String cert1(@RequestParam String email, RedirectAttributes attr) throws MessagingException {
		certService.sendCertification(email);
//		return "redirect:cert2?email="+email;//직접 추가 권장하지 않는다
		attr.addAttribute("email", email);
		return "redirect:cert2";
	}
	
	//인증번호 입력 페이지
	@GetMapping("/cert2")
	public String cert2() {
		return "cert2";//"/WEB-INF/views/cert2.jsp"
	}
	
	@PostMapping("/cert2")
	public String cert2(@ModelAttribute CertDto certDto) {
		boolean result = certService.checkCertification(certDto);
		if(result) {
			return "redirect:cert3";
		}
		else {
			return "redirect:cert2?error";
		}
	}
	
	//인증 성공 페이지
	@GetMapping("/cert3")
	public String cert3() {
		return "cert3";//"/WEB-INF/views/cert3.jsp"
	}
	
}

