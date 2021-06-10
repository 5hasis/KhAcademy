<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<style>
		input[type=text]:focus,input[type=password]:focus {background-color:skyblue;}
	</style>
	<script>
		$(function(){
			
			$("#id-input").on("input", function(){
				var id = $(this).val();
				var regex = /^[a-z][a-z0-9]{3,9}$/;
				if(!regex.test(id)){
					$(this).next("span").text("소문자 시작, 소문자+숫자로만 4글자이상~10글자 이하로만 입력해주세요");
					$(this).next("span").css("color", "blue");
				}
				if(regex.test(id)){
					$(this).css("background-color", "white");
					$(this).next("span").text("");
				}
			});
			
			$("#pw-input").on("input", function(){
				
				var password = $(this).val();
				var regex = /^[a-zA-Z0-9]{8,16}$/;
				if(!regex.test(password)){
					$(this).next("span").text("영어 소문자,대문자,숫자 중 8~12글자로만 입력해주세요");
					$(this).next("span").css("color", "blue");
				}
				else{
					$(this).css("background-color","white");
					$(this).next("span").text("");
				}
			});
			
			
			$("#pw-re-input").on("input",function(){
				
				var password = $("#pw-input").val();
				var passwordRe = $(this).val();
					
				if(!password || !passwordRe){
					$(this).next("span").text("패스워드를 입력하세요");
					$(this).val("");
					$("#pw-input").focus();
				}
				
				else if(password === passwordRe){
					$(this).css("background-color","white");
					$(this).next("span").text("비밀번호가 일치합니다");
					$(this).next("span").css("color", "green");
				}
				else{
					$(this).next("span").text("비밀번호 재입력");
					$(this).next("span").css("color", "blue");
				}
				
			});
			
			$("#input-name").on("input", function(){
				var name = $(this).val();
				var regex = /^[가-힣]{2,5}$/;
				if(!regex.test(name)){
					$(this).next("span").text("한글로만 2~5글자 이하로 입력해주세요");
					$(this).next("span").css("color", "blue");
				}
				else{
					$(this).css("background-color", "white");
					$(this).next("span").text("");
				}
			});
			
			$("form").submit(function() {
				var id = $("#id-input").val();
				//var id = $(this).find("input[name=memberId]").val()''
				
				var idRegex = /^[a-z][a-z0-9]{3,9}$/;
				var password = $("#pw-input").val();
				var pwRegex = /^[a-zA-Z0-9]{8,16}$/;
				
				if(!idRegex.test(id)) {
					alert("ID를 다시 확인하고 입력해주세요");
					return false;
				}
				
				else if(!pwRegex.test(password)) {
					alert("PW를 다시 확인하고 입력해주세요");
					return false;
				}
			});
			
		});
		
	</script>
</head>
<body>
<form action="/memberJoin.do" method="post">
<fieldset>
	<legend>회원 가입</legend>
		<label for="id-input">회원 ID : </label>
		<input type="text" name="memberId" id="id-input" placeholder="ID를 입력하세요" >
		<span></span><br>
		
		<label for="pw-input">회원 PW : </label>
		<input type="password" name="memberPw" id="pw-input" placeholder="PW를 입력하세요" >
		<span></span><br>
		
		<label for="pw-re-input">회원 PW확인 : </label>
		<input type="password" id="pw-re-input" placeholder="PW를 입력하세요" >
		<span></span><br>
		
		<label for="input-name">회원 이름 : </label>
		<input type="text" name="memberName" id="input-name" placeholder="이름를 입력하세요" ><br>
		
		<span>성별 : </span>
		<label><input type="radio" name="sex" class="sex" value="boy" checked>남</label>
		<label><input type="radio" name="sex" class="sex" value="girl">여</label><br><br>
		
		<input type="submit" id="signUp-submit" value="회원가입">
		<input type="button" value="취소" class="cancle">
</fieldset>
</form>

</body>
</html>