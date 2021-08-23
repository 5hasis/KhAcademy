package com.kh.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.home.entity.BoardDto;
import com.kh.home.repository.BoardDao;

@Controller
//공용 주소 설정. GetMapping, PostMapping 사용 불가
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		List<BoardDto> boardList = boardDao.list();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
}
