package com.kh.spring03;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//이 클래스가 "컨트롤러" 계층임을 명시하는 어노테이션
public class HomeController{
	
	//아래 메소드는 "/" 라는 요청에 대한 처리 내용임을 명시하는 어노테이션
	@RequestMapping("/")
	public String home() {
		
		//return "/WEB-INF/views/home.jsp"
		return "home"; //servlet-context에 뷰 리졸버 추가해서 경로 자동완성 도구 등록
	}
	
	//Spring에서는 Model만 따로 이용 가능
	//= 매개변수에 Model이라는 자료형으로 매개변수를 선언하면 자동 할당됨.
	//= 자동 할당된 Model 객체에 데이터를 추가하면 자동으로 view로 전달됨.
	@RequestMapping("/dice")
	public String dice(Model model) {
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		
		model.addAttribute("dice", dice);//dice를 model에 첨부
		
		//return "/WEB-INF/views/dice.jsp"
		return "dice";
	}
	
	//메소드에 필요한 정보를 선언하면 자동으로 할당해줌.
	//= 요청이 필요할 경우 HttpServletRequest를 선언해야함
	@RequestMapping("/plus")
	public String plus(HttpServletRequest request, Model model) {
		int a= Integer.parseInt(request.getParameter("a"));
		int b= Integer.parseInt(request.getParameter("b"));
		int total = a + b;
		
		model.addAttribute("total", total);
		
		//return "/WEB-INF/views/test/plus.jsp"
		return "test/plus";
	}
	
	//변수를 매개 변수에 선언하면 "파라미터"를 의미.
	//- 파라미터임을 명시하고 싶다면 @RequestParam을 추가
	@RequestMapping("/plus2")
	public String plus2(
			@RequestParam int a, 
			@RequestParam int b, 
			Model model) {
		model.addAttribute("total", a + b);
		return "test/plus";
	}
	
	//파라미터를 변수를 특정 객체에 자동 매핑할 수 있음
	//= 매개변수에 객체를 선언하면 자동 매핑이 수행.
	//= @ModelAttribute라고 명시하면 객체 내부에 매핑하라는 의미
	@RequestMapping("/plus3")
	public String plus2(
			@ModelAttribute TestDto testDto, Model model) {
		model.addAttribute("total", testDto.getA() + testDto.getB());
		return "test/plus";
		
	}
}

