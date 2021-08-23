package com.kh.spring02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PlusController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		int total = a + b;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/views/plus.jsp");
		mv.addObject("total", total);
		return mv;
		
	}

}
