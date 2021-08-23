package com.kh.spring04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring04.beans.ItemDao;
import com.kh.spring04.beans.ItemDto;

@Controller
public class ItemController {
	
	@RequestMapping("/")
	public String home() {
		//return "/WEB-INF/views/home.jsp";
		return "home";
	}
	
	//ItemController가 생성되는 시점부터
	//미리 등록된 ItemDao를 사용 가능하도록 자동 주입 설정을 함.
	//=의존성 주입(DI, Dependency Injection)
	//=Spring의 2번째 특징
	//=ItemDao 또는 그의 자식 클래스 중에서 등록된 요소를 주입하라.
	@Autowired
	private ItemDao itemDao;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception {
		List<ItemDto> list = itemDao.list();
		
		model.addAttribute("list", list);
		
		//return "/WEB-INF/views/list.jsp";
		return "list";
	}
	
}

