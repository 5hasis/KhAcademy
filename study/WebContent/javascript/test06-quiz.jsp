<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>비밀번호 입력창 문제</title>
	<script>
		//1. 표시 버튼을 누르면 test1 함수가 실행되도록 연결
		//2. 숨김 버튼을 누르면 test2 함수가 실행되도록 연결
		
		function test1(){
			//표시 : 입력창의 type을 text로 바꾼다
			var target = document.querySelector("input[name=memberPw]");
			target.type = "text";
		}
		function test2(){
			//숨김 : 입력창의 type을 password로 바꾼다
			var target = document.querySelector("input[name=memberPw]");
			target.type = "password";
		}
		function test3(){
			var btn = document.querySelector(".btn");
// 			if(btn.value.equals("표시")){//자바였다면
			if(btn.value == "표시"){//자바스크립트라면
				test1();
				btn.value = "숨김";
			}
			else{
				test2();
				btn.value = "표시";
			}
		}
	</script>
</head>
<body>
	<form action="?" method="post">
		<input type="password" name="memberPw">
		<input type="button" value="표시" onclick="test1();">
		<input type="button" value="숨김" onclick="test2();">
		<input type="button" value="표시" onclick="test3();" class="btn">
	</form>
</body>
</html>