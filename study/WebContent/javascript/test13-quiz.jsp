<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>입력창 클래스 스타일링</title>
	<script>
		function nicknameCheck(){
			var regex = /^[가-힣]{2,10}$/;
			
			var nicknameInput = document.querySelector("input[name=memberNick]");
// 			console.log(nicknameInput);

			nicknameInput.classList.remove("correct", "incorrect");
			
// 			입력창에 값이 없는 경우는 비어있는 문자열로 보면 된다.
//				= 자바스크립트는 부정적인 값을 false와 같다고 본다(0, "", null, ...)
// 			if(nicknameInput.value != ""){//입력값이 빈 문자열이 아니라면(=입력값이 있다면)
// 			if(nicknameInput.value.length > 0){//입력값의 글자수가 0보다 크다면
	
			if(nicknameInput.value){//입력값이 긍정적인 값이라면
				if(regex.test(nicknameInput.value)){
					//correct라는 클래스를 부여
					nicknameInput.classList.add("correct");
				}
				else{
					//incorrect라는 클래스를 부여
					nicknameInput.classList.add("incorrect");
				}	
			}
		}
	</script>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		.form-input.correct{
			background-image: url("../image/correct.png");
			background-repeat: no-repeat;
			background-size: 25px;
			background-position: right;
		}
		.form-input.incorrect{
			background-image: url("../image/incorrect.png");
			background-repeat: no-repeat;
			background-size: 25px;
			background-position: right; 
		}
	</style>
</head>
<body>
	
	<div class="container-600">
		<div class="row text-center">
			<h2>닉네임 입력</h2>
		</div>
		<div class="row">
			<input type="text" name="memberNick" class="form-input form-input-underline" placeholder="닉네임 입력" oninput="nicknameCheck();">		
		</div>
	</div>
	
</body>
</html>