package com.kh.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.home.repository.BoardDao;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;

}
