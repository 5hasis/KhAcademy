<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script>
		$(function(){
			
			$("#id-input").on("blur", function(){
				var id = $(this).val();
				var regex = /^[A-Z][a-zA-Z0-9]{5,}$/;
				if(!regex.test(id)){
					window.alert("5글자이상, 첫글자는 대문자이고 영문자, 숫자만 가능");
					$(this).val = "";
				}
				if(regex.test(id)){
					
					$(this).next("span").text("올바른 아이디 형식입니다");
					$(this).next("span").css("color", "green");
					$(this).next("span").css("font-weight", "bold");
				}
				else{
					$(this).next("span").text("5글자이상, 첫글자는 대문자이고 영문자, 숫자만 가능");
					$(this).next("span").css("color", "red");
					$(this).next("span").css("font-weight", "bold");
					$(this).val("");
					
				}
				
			});
			
			//비밀번호 입력창에 input/blur 이벤트를 설정
			$("#pw-input").on("input", function(){
				
				var password = $(this).val();
				var regex = /^[a-zA-Z0-9]{8,16}$/;
				if(regex.test(password)){
					
					$(this).next("span").text("올바른 비밀번호 형식입니다");
					$(this).next("span").css("color", "green");
					$(this).next("span").css("font-weight", "bold");
				}
				else{
					$(this).next("span").text("비밀번호는 영문,숫자 8~16자 이내로 작성하세요");
					$(this).next("span").css("color", "red");
					$(this).next("span").css("font-weight", "bold");
				}
			});
			
			
			$("#pw-re-input").on("input",function(){
				
				var password = $("#pw-input").val();
				var passwordRe = $(this).val();
				
				
				if(!password || !passwordRe){
					//if(!password && passwordRe)
					$(this).next("span").text("패스워드를 입력하세요");
					$(this).next("span").css("font-weight", "bold");
					$(this).val("");
					$("#pw-input").focus();
					//$(#pw-input).select();
					
				}
				else if(password === passwordRe){
					$(this).next("span").text("비밀번호가 일치합니다");
					$(this).next("span").css("color", "green");
					$(this).next("span").css("font-weight", "bold");
				}
				else{
					$(this).next("span").text("비밀번호가 일치하지 않습니다");
					$(this).next("span").css("color", "red");
					$(this).next("span").css("font-weight", "bold");
				}
			});
			
			$("form").submit(function() {
				
				var rcheck = $(".sex:checked").length;
				if (rcheck == 0) {
					alert("성별을 선택하세요");
					return false;
				}
	
			});
			
		});
		
		window.addEventListener("load", function(){
			var btn = document.querySelector(".cancle");
			btn.addEventListener("click", function(){
				location.reload();
			});
		});
	</script>
</head>
<body>
<div class="container-600">
	<form action="result.html" method="post">
		<div class="row">
			<label for="id-input">아이디</label>
			<input type="text" name="memberId" id="id-input" required>
			<span></span>
		</div>
		<div class="row">
			<label for="pw-input">패스워드</label>
			<input type="password" name="memberPw" id="pw-input" required>
			<span></span>
		</div>
		<div class="row">
			<label for="pw-re-input">패스워드 확인</label>
			<input type="password" id="pw-re-input"required>
			<span></span>
		</div>
		<div class="row">
			<label>이름<input type="text" name="memberName" required></label>
		</div>
		<div class="row">
			<span>성별</span>
			<label><input type="radio" name="sex" class="sex" value="boy">남</label>
			<label><input type="radio" name="sex" class="sex" value="girl">여</label>
		</div>
		<div class="row">
			<label>이메일<input type="text" name="memberEmail" required></label>
		</div>
		<div class="row">
			<input type="submit" value="회원가입">
			<input type="button" value="취소" class="cancle"> 
		</div>
		
	</form>
	</div>
	

</body>
</html>