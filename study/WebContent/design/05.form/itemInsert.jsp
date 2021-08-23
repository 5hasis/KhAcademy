<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>아이템 등록</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
	
	</style>
</head>
<body>

	<form action="/study/jsp/itemInsert.kh">
		<div class="container-400">
			<div class="row text-center">
				<h1>아이템 정보 입력</h1>
			</div>
			<div class="row">
				<label for="item-name-input">아이템 이름</label>
				<input type="text" name="itemName" required class="form-input form-input-underline" id="item-name-input"> 
			</div>
			<div class="row">
				<label for="item-price-input">판매 가격</label>
				<input type="number" name="itemPrice" required class="form-input form-input-underline" id="item-price-input">
			</div>
			<div class="row">
				<input type="submit" value="등록하기" class="form-btn form-btn-positive">
			</div>
			<div class="row">
				<input type="button" value="목록보기" class="form-btn form-btn-normal">
			</div>
		</div>	
	
	</form>
	
</body>
</html>