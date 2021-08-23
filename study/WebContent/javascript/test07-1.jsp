<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>이미지 확대/축소</title>
	<script>
		//전달된 width, height로 크기를 설정하는 함수
		function setSize(width, height){
			var banner = document.querySelector(".banner");
			banner.width = width;
			banner.height = height;
		}
		function changeSize(){
			var input = document.querySelector(".size-input");
			var size = input.value;
			setSize(size, size);
		}
	</script>
</head>
<body>
	<input type="text" class="size-input">
	<input type="button" value="변경" onclick="changeSize();">
	<hr>
	<img src="<%=request.getContextPath()%>/image/dog.png" width="200" height="200" class="banner">
</body>
</html>