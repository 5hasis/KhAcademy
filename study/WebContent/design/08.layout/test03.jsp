<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Layout 구현하기(1)</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		main, aside, section, article, header, footer{
			border:1px dotted black;
		}
		
		/* 리셋 스타일 */
		html, body{
			margin:0;
			padding:0;
		}
		
		main {
			width:1200px;
			margin:auto;
		}
		aside {
			float:left;
			width:20%;
			min-height:500px;
		}
		section::after {
			content:"";
			display:block;
			clear: both;
		}
		
		header {
			min-height: 100px;
		}
		article {
			float:left;
			width:80%;
			min-height:500px;
		}
		footer {
			min-height:100px;
		}
	</style>
</head>
<body>
	<!-- 가장 바깥 영역 -->
	<main>
		<header></header>

		<!-- 컨텐츠영역 -->
		<section>
			<!-- 사이드영역 -->
			<aside>
			
			</aside>
			<article>
			
			</article>
		</section>
		
		<footer></footer>
	</main>
</body>
</html>
