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
		$(function(){
			//목표 : 버튼을 누르면 알림창을 출력
			
			//자바스크립트 구현
			document.querySelector(".test-btn").addEventListener("click", function(){
				window.alert("잘했어요(자바스크립트)");
			});
		
			//jQuery 구현
			//$(".test-btn").on("click", function(){});
			$(".test-btn").click(function(){
				window.alert("잘했어요(jQuery)");
			});
		});
	</script>
</head>
<body>
	
	<button class="test-btn">눌러보세요!</button>
	
</body>
</html>

