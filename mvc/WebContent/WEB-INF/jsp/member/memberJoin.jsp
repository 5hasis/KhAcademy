<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<h1>회원 가입</h1>

<form action="memberJoin.kh" method="post">
	<input type="text" name="memberId">
	<br><br>
	<input type="password" name="memberPw">
	<br><br>
	<input type="text" name="memberNick">
	<br><br>
	<input type="date" name="memberBirth">
	<br><br>
	<input type="tel" name="memberPhone">
	<br><br>
	<input type="email" name="memberEmail">
	<br><br>
	<input type="submit" value="등록">
</form>