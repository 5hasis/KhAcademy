<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>사이드바 만들기</title>
	<script>
		function toggleMenu(){
			var sidebar = document.querySelector(".sidebar");
// 			console.log(sidebar.classList);
// 			if(sidebar.classList.contains("active")){
// 				sidebar.classList.remove("active");
// 			}
// 			else{
// 				sidebar.classList.add("active");
// 			}
			sidebar.classList.toggle("active");
		}
	</script>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
		.sidebar {
			background-color:yellow;
			position:fixed;
			top:0px;
			left:0px;
			bottom:0px;
			width:250px;
			margin-left:-250px;
			/* 
				원하는 항목을 서서히 변화하도록 설정
				transition: 적용할항목 시간 타이밍함수; 
			*/
			transition: margin-left 0.5s ease-in-out;
		}
		.sidebar.active {
			margin-left:0px;
		}
		
		.sidebar-btn {
			position:fixed;
			top:10px;
			left:10px;
			font-size:30px;
		}
	</style>
</head>
<body>
	
	<aside class="sidebar">
		<button class="sidebar-btn" onclick="toggleMenu();">&#8801;</button>	
	</aside>
</body>
</html>

