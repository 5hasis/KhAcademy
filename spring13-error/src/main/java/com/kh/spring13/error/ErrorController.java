package com.kh.spring13.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

/**
 * 이 클래스는 컨트롤러가 아니라 컨트롤러를 간섭하기 위한 클래스
 * = 컨트롤러에서 발생하는 예외상황을 간섭하여 원하는 처리를 수행하도록 유도(변경) 
 * = @ControllerAdvice 로 등록
 * = 이러한 간섭용 객체(AOP 구현체)는 반드시 '간섭 대상'이 설정되어야 함.
 * 
 * @ExceptionHandler는 @RequestMapping은 아니지만 동일한 도구 사용가능
 * = HttpServletRequest, HttpServletResponse, HttpSession, ...
 * = 추가로 예외 객체를 매개변수에 할당하여 정보를 수신할 수 있음.
 * = IOException, SQLException, RuntimeException등 대형 예외들 위주로 처리 가능
 * = Exception을 통한 all-in-one 처리도 가능
 * 
 * (주의) 404 예외는 처리가 불가능. 필터/인터셉터의 예외토 처리가 불가능
 **/

//@ControllerAdvice(basePackages = "com.kh.spring13.controller")
@ControllerAdvice(annotations = {Controller.class})
@Slf4j
public class ErrorController {

	@ExceptionHandler(Exception.class)
	public String handler(HttpServletRequest request, Exception e) {
		log.error("ID = {}", request.getRemoteAddr());
		log.error("오류 발생", e);
		return "error/handler1";
	}
}
