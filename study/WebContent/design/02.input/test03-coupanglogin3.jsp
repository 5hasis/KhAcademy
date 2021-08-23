<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠팡 로그인</title>
<style>
	/*
		디자인을 1개의 태그에 적용시키는 훈련보다는 레이아웃을 구현하는 요령에 대해서 고민해본다!
		
		대원칙
		1. 기본 글꼴을 설정한다
		2. box-sizing을 설정한다
	*/
	
	* {
		font-family: Neo Sans Pro , sans-serif;
		box-sizing: border-box;
	}
	
	/*
		바깥 영역 생성 규칙
		- 영역은 100px부터 1200px까지 100px 간격으로 설정할 수 있다.
		- container-100 과 같은 형태의 클래스 모양으로 디자인한다.
	*/
	
	.container-100 { width:100px; }
	.container-200 { width:200px; }
	.container-300 { width:300px; }
	.container-400 { width:400px; }
	.container-500 { width:500px; }
	.container-600 { width:600px; }
	.container-700 { width:700px; }
	.container-800 { width:800px; }
	.container-900 { width:900px; }
	.container-1000 { width:1000px; }
	.container-1100 { width:1100px; }
	.container-1200 { width:1200px; }
	.container-1300 { width:1300px; }
	.container-1400 { width:1400px; }
	.container-1500 { width:1500px; }
	
	/*
		바깥 영역의 정렬 규칙
		- 영역은 원한다면 좌, 우, 가운데 위치할 수 있어야 한다.
		- 기본적으로 가운데 위치하게 만들고 원한다면 왼쪽 좌, 우 위치가 가능하도록 스타일을 미리 구현
	*/
	.container-100, .container-200, .container-300, .container-400, .container-500,
	.container-600, .container-700, .container-800, .container-900, .container-1000,
	.container-1100, .container-1200, .container-1300, .container-1400, .container-1500 {
		margin-left:auto;
		margin-right:auto;
	}
	.container-left {
		margin-left:0px;
		margin-right:auto;
	}
	.container-center {
		margin-left: auto;
		margin-right: auto;
	}
	.container-right {
		margin-left: auto;
		margin-right:0px;
	}
	
	/*
		영역 내부에 줄을 배치하여 원하는 도구들을 위치시키도록 구현
	*/
	.row {
		width:100%;
		margin-top: 10px;
		margin-bottom: 10px;
	}
	
	/*
		내용물 정렬 규칙
	*/
	.text-left {
		text-align: left;
	}
	.text-right {
		text-align: right;
	}
	.text-center {
		text-align: center;
	}
	
	div {
		border-width: 1px;
		border-color: grey;
		border-style:dotted;
	}
	
	.coupang-logo {
		font-size: 60px;
	}
	.coupang-logo > span {
		display: inline-block;
		margin: 0 -7px;
	}
	.coupang-logo > span:nth-child(1),
	.coupang-logo > span:nth-child(2),
	.coupang-logo > span:nth-child(3) {
		color:rgb(147, 82, 39); 
	}
	.coupang-logo > span:nth-child(4) {
		color:rgb(247, 85, 47);
	}
	.coupang-logo > span:nth-child(5) {
		color:rgb(255, 197, 5);
	}
	.coupang-logo > span:nth-child(6) {
		color:rgb(136, 204, 47);
	}
	.coupang-logo > span:nth-child(7) {
		color:rgb(49, 180, 221);
	}
	
	.form-input , .form-btn {
		width:100%;
		font-size: 20px;
		padding: 1rem;
	}
	.form-input {
		padding-left: 3.5rem;
	}
	.id-input {
 		background-image: url("/study/image/email.png"); 
/* 		background-image: url("../../image/email.png"); */
		background-size: 2rem;
		background-repeat: no-repeat;
		background-position: 10px;
	}
	.pw-input {
		background-image: url("/study/image/lock.png");
/* 		background-image: url("../../image/lock.png"); */
		background-size: 2rem;
		background-repeat: no-repeat;
		background-position: 10px;
	}
	.form-btn {
		border-style: solid;
		border-color: lightgray;
	}
	.btn-normal {
		background-color: white;
		color:rgb(0, 116, 233);
	}
	.btn-submit {
		background-color: rgb(0, 116, 233);
		color:white;
	}
</style>
</head>
<body>
	<div class="container-400">
		<div class="row text-center">
			<div class="coupang-logo">
				<span>c</span>
				<span>o</span>
				<span>u</span>
				<span>p</span>
				<span>a</span>
				<span>n</span>
				<span>g</span>
			</div>
		</div>
		
		<form action="" method="post">
			<div class="row">
				<input type="text" name="memberId" placeholder="아이디(이메일)" required class="form-input id-input">
			</div>  
			<div class="row">
				<input type="password" name="memberPw" placeholder="비밀번호" required class="form-input pw-input">
			</div>
			<div class="row">
				<input type="submit" value="로그인" class="form-btn btn-submit">
			</div>
		</form>
		
		<hr>
		<div class="row">
			<input type="button" value="회원가입" class="form-btn btn-normal">
		</div>
		<div class="row text-center">
			&copy; Coupang Corp. All rights reserved.
		</div>
	</div>
</body>
</html>