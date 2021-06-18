package com.kh.home.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class MemberLoginInterceptor implements HandlerInterceptor{
	//목표 : 비회원의 접근 차단
	//참조 : 세션의 memberNo(없을 수도 있으므로 Integer)
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle 실행");
		System.out.println(handler);
		
		//Integer memberNo = (Integer)request.getSession().getAttribute("memberNo");
		boolean isLogin = request.getSession().getAttribute("memberNo") != null;
		if(!isLogin) {
			//response.sendError(403); //로그인은 했는데 권한이 없는거
			//response.sendError(401); //미인증
			response.sendRedirect(request.getContextPath()+"/member/login");
			return false;
		}
		
		
		return true;
		
	}
}
