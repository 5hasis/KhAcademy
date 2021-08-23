package com.kh.spring13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/error1")
	public String error1() {
		int a = 10/0; //ArithmeticException
		log.debug("a = {}", a);
		return "redirect:/";
	}
	
//	@ExceptionHandler : 예외를 처리할 수 있는 메소드를 지정할 때 사용
//	= 현재 컨트롤러에서만 발생하는 예외만 처리할 수 있으므로 스프링에서 추구하는 통합 처리와 맞지 않음
	@ExceptionHandler(ArithmeticException.class)
	public String handler1() {
		return "error/handler1"; //"/WEB-INF/views/error/handler1.jsp";
	}
	
}
