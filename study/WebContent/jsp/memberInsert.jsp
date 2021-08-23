<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>


	<div class = "container-500">
		<div class="row text-center">
			<h1>회원 가입</h1>
		</div>
		<form>
			<div class="row"></div>
			<div class="row"></div>
			<div class="row"></div>
			<div class="row"></div>
			<div class="row"></div>
			<div class="row"></div>
			<div class="row"></div>
		</form>
	</div>
	
	<h2>회원 정보 입력</h2>
	<!-- <form action ="/study/jsp/itemInsert.kh">  -->
	<form action = "memberInsert.kh">
		아이디 : <input type="text" name="memberId" required>
		
		<br><br>
		
		비밀번호 : <input type="password" name="memberPw" required>
		
		<br><br>
		
		닉네임 : <input type="text" name="memberNick" required>
		
		<br><br>
		
		생일 : <input type="date" name="memberBirth" >
		
		<br><br>
		
		 전화번호: <input type="tel" name="memberPhone">
		
		<br><br>
		
		이메일 : <input type="email" name="memberEmail" required>
		
		<br><br>
		
		<input type="submit" value="가입">
	
	</form>

</body>
</html>