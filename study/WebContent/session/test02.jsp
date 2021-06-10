<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>test02.jsp</h1>
    
<!-- 세션에 있는 현재 사용자 영역에 a란 이름의 값을 추출 -->
<h1>a = <%=session.getAttribute("a") %></h1>
<h1><%=session.getId() %></h1>