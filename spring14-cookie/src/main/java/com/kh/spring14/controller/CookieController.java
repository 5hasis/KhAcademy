package com.kh.spring14.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	//@CookieValue는 해당하는 이름의 쿠키의 값을 읽어오는 annotation
	//= Spring에서는 annotation을 이용하여 특정 쿠키만 가져올 수 있도록 지원
	@RequestMapping("/")
	public String home(@CookieValue(required = false) String visit, Model model) {
		System.out.println("visit = "+ visit);
		model.addAttribute("visit", visit);
		return "home";
	}
	
	/**
	 * 쿠키를 생성
	 * = 쿠키 객체를 만들어 사용자에게 보냄
	 * = 사용자에게 보내기 위해서는 HttpServletResponse(응답객체)가 필요 <-> 화면에 띄울때 Model
	 * */
	
	@RequestMapping("/create")
	public String create(HttpServletResponse response) throws UnsupportedEncodingException {
		String time = "2021-06-23";
		String encode = URLEncoder.encode(time, "UTF-8"); //불편한 값들에 대한 변환
		Cookie cookie = new Cookie("visit", encode); //쿠키 객체를 (이름, 값)으로 생성, 유니코드나 띄어쓰기 들어가면 안댕! -> 그래서 encoder로 변환
		cookie.setMaxAge(10); //쿠키의 유효시간을 초단위로 설정
		response.addCookie(cookie); //쿠키를 사용자에게 보냄
		return "redirect:/";
	}
	
}
