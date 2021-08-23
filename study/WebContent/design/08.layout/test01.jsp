<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Layout 구현하기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		div{
			border:1px dotted black;
		}
		
		/* 리셋 스타일 */
		html, body{
			margin:0;
			padding:0;
		}
		.main{
			width:1200px;
			margin:auto;
		}
		.main::after{
			content:"";
			display:block;
			clear:both;
		}
		.side{
			float:left;
			width:20%;
			min-height:500px;
		}
		.content{
			float:left;
			width:80%;
			min-height:500px;
		}
		.header{
			min-height:100px;
		}
		.section{
			min-height:300px;
		}
		.footer{
			min-height:100px;
		}
		
	</style>
</head>
<body>
	<!-- 가장 바깥 영역 -->
	<div class="main">
	
		<!-- 사이드 영역 -->
		<div class="side">
		</div>
		
		<!-- 컨텐츠 영역 -->
		<div class="content">
			<div class="header"></div>
			<div class="section"></div>
			<div class="footer"></div>
		</div>
	</div>

</body>
</html>