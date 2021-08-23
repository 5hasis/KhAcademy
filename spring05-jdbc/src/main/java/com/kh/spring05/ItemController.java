package com.kh.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.spring05.entity.ItemDto;
import com.kh.spring05.repository.ItemDao;

@Controller
public class ItemController {
	
	@Autowired
	private ItemDao itemDao;
	
	//등록 : GET/POST를 구분하여 사용
	//@RequestMapping : 모든 방식의 요청
	//@GetMapping : GET 방식 요청(5.x 부터 사용 가능)
	//@POSTMapping : POST 방식 요청(5.x 부터 사용 가능)
	
	//@RequestMapping(value="/insert", method=RequestMethod.GET)
	@GetMapping("/insert")
	public String insert() {
		//return "/WEB-INF/views/item/insert.jsp";
		return "item/insert";
	}

	
//	public String insert(
//			@RequestParam String itemName,
//			@RequestParam int itemPrice) {
	
	//@RequestMapping(value="/insert", method=RequestMethod.POST)
	@PostMapping("/insert")
	public String insert(@ModelAttribute ItemDto itemDto) {
		
		itemDao.insert(itemDto);
		
		//등록을 마치면 다시 입력페이지로 돌아감(redirect)
		return "redirect:insert";
	}
}
