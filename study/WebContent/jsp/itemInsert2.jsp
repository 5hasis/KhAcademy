<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이템 등록</title>
</head>
<body>
	<h1>아이템 정보 입력(2번 방식)</h1>
	<!-- <form action ="/study/jsp/itemInsert.kh">  -->
	<form action = "itemInsert2.kh" method="post">
		이름 : <input type="text" name="itemName" required>
		
		<br><br>
		
		가격 : <input type="text" name="itemPrice" required>
		
		<br><br>
		
		<input type="submit" value="등록">
	
	</form>

</body>
</html>