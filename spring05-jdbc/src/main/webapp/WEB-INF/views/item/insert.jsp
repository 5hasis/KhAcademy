<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>아이템 등록</h1>

<form action="insert" method="post">
	이름 : <input type="text" name="itemName" required>
	<br><br>
	가격 : <input type="text" name="itemPrice" required>
	<br><br>
	<input type="submit" value="등록">
</form>