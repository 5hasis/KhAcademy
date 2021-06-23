package com.kh.spring14.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	/**
	 * 쿠키를 생성
	 * = 쿠키 객체를 만들어 사용자에게 보냄
	 * = 사용자에게 보내기 위해서는 HttpServletResponse(응답객체)가 필요 <-> 화면에 띄울때 Model
	 * */
	
	@RequestMapping("/create")
	public String create(HttpServletResponse response) {
		String time = "2021-06-23";
		Cookie cookie = new Cookie("visit", time); //쿠키 객체를 (이름, 값)으로 생성, 유니코드나 띄어쓰기 들어가면 안댕!
		cookie.setMaxAge(10); //쿠키의 유효시간을 초단위로 설정
		response.addCookie(cookie); //쿠키를 사용자에게 보냄
		return "redirect:/";
	}
	
}
