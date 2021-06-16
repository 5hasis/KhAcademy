<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- css, image 불러오기 테스트 -->    

<!-- 
	<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
	<link rel="stylesheet" type="text/css" href="http://localhost8080/home/resources/css/layout.css"> 
-->

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container-600">
	<div class="row">
		<h2>어서와 내 홈페이지는 처음이지?</h2>
	</div>
	<div class="row">
		<img src="image/dog.png" width="500" height="350">
	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>