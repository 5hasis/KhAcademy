<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>폼(Form) 디자인</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
	
	</style>
</head>
<body>
	
	<!-- 
		label : 
		- 입력창에 연결시키는 내용 작성 공간
		- span과 비슷해 보이지만, 입력창을 타겟팅 할 수 있다는 특징을 가지고 있다.
		- 타겟팅을 하려면 대상의 ID가 존재해야 하며, label에 for라는 속성을 사용해야 한다.
		- for가 없어도 선택되도록 만들 수는 있다.
	 -->
	 
	<label for="id-input">아이디</label>
	<input id="id-input" type="text" name="memberId">
	
	<br><br>
	
	<input type="checkbox" name="agree" id="agree-input"> 
	<label for="agree-input">동의합니다</label>
	
	<br><br>
	
	<label>
		<input type="checkbox" name="agree" id="agree-input">
		<span>동의합니다.</span>
	</label>
	
</body>
</html>