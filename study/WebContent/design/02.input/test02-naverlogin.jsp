<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>네이버 로그인 화면 만들기</title>

	<style>
		body{
			text-align: center; 
		}
	
		/*
			box-sizing : 어디까지를 폭으로 볼것인가에 대한 설정
				- content-box : 내용물을 기준
				- border-box : 테두리를 기준
		*/
		#naver-logo{
			font-family: sans-serif;
			font-weight: bold; 
			font-size: 60px;
			color:#2bd400; 
		}
		#naver-id-input{
			width:400px;
			padding:1rem;
			box-sizing: border-box;
			font-family: sans-serif;
			font-size: 20px;
		}
		#naver-pw-input{
			width:400px;
			padding:1rem;
			box-sizing: border-box;
			font-family: sans-serif;
			font-size: 20px;
		}
		#naver-submit{
			width:400px;
			padding:1rem;
			background-color: #2bd400;
			color:white;
			border-style: none;
			font-family: sans-serif;
			font-size: 20px;
		}
	</style>

</head>
<body>
	
	<h1 id="naver-logo">NAVER</h1>
	
	<form action="?" method="post">
		
		<input type="text" name="memberId" required id="naver-id-input">
		<br><br>
		<input type="password" name="memberPw" required id="naver-pw-input">
		<br><br>
		<input type="submit" value="로그인" id="naver-submit">
		
	</form>
	
</body>
</html>