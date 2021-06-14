package com.kh.spring03;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//이 클래스가 "컨트롤러" 계층임을 명시하는 어노테이션
public class HomeController{
	
	//아래 메소드는 "/" 라는 요청에 대한 처리 내용임을 명시하는 어노테이션
	@RequestMapping("/")
	public String home() {
		return "/WEB-INF/views/home.jsp";
	}
	
	//Spring에서는 Model만 따로 이용 가능
	//= 매개변수에 Model이라는 자료형으로 매개변수를 선언하면 자동 할당됨.
	//= 자동 할당된 Model 객체에 데이터를 추가하면 자동으로 view로 전달됨.
	@RequestMapping("/dice")
	public String dice(Model model) {
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		
		model.addAttribute("dice", dice);//dice를 model에 첨부
		
		return "/WEB-INF/views/dice.jsp";
	}
	
}

