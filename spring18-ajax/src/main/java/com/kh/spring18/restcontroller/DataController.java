package com.kh.spring18.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//비동기통신에 대응하는 컨트롤러
//= ViewResolver 적용 받지 않음
@RestController//@Controller + @ResponseBody
@RequestMapping("/data")
public class DataController {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";//문자열
	}
	
}