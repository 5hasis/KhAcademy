<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int n = 10;
	/* 페이지에서 만든 변수는 해당 페이지 내에서만 사용 가능 */
	
	//세션(HttpSession)
	//=서버에 내장된 정보 저장 공간
	//=사용자별로 정보를 저장할 수 있도록 구성
	//=setAttribute 명령으로 이름과 값을 저장
	//=getAttribute 명령으로 값을 추출
	//=removeAttribute 명령으로 값을 삭제
	
	//세션에 현재 사용자 영역에 a=10을 저장
	session.setAttribute("a", 10);
%>

<h1>n = <%=n%></h1>

<h1>test01.jsp</h1>

<!-- 세션에 있는 현재 사용자 영역에 a란 이름의 값을 추출 -->
<h1>a = <%=session.getAttribute("a") %></h1>

<!-- 세션의 고유번호 확인 -->
<h1><%=session.getId() %></h1>

