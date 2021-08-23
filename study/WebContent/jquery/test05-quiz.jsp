<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>color button</title>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	
	<script>
		$(function(){
			//빨강, 파랑 버튼에 대한 이벤트를 각각 설정
			$(".red-btn").click(function(){
				$("h1").css("color", "red");
			});
			
			$(".blue-btn").click(function(){
				$(".target").css("color", "blue");
			});
		});
	</script>
</head>
<body>
	<button class="red-btn">빨강</button>
	<button class="blue-btn">파랑</button>
	<hr>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
	<h1 class="target">Hello jQuery!</h1>
</body>
</html>