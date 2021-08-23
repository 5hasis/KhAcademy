<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery</title>
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
	
	</style>
	
<!-- 	개발할 때는 uncompressed 버전, 개발 후 배포시에는 compressed(minify) 버전을 사용 -->
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- 	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
	<script>
// 		목표 : 모든 h1 태그의 글자색을 빨강으로 설정
	
// 		자바스크립트로 구현하면...
// 		window.addEventListener("load", function(){
// 			var h1 = document.querySelectorAll("h1");
// 			for(var i=0; i < h1.length ; i++){
// 				h1[i].style.color = "red";
// 			}
// 		});
	
// 		jQuery로 구현하면..
		$(function(){
			$("h1").css("color", "red");
		});
	</script>
</head>
<body>
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
	<h1>Hello jQuery!</h1>
</body>
</html>

