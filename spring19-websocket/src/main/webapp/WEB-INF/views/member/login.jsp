<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>    

<form action="login" method="post">
	id : <input type="text" name="memberId">
	<br><br>
	pw : <input type="password" name="memberPw">
	<br><br>
	<input type="submit" value="로그인">
</form>