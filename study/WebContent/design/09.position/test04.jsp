<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>메뉴 만들기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		/*
			상단 메뉴 디자인
			1. 메뉴가 아래로 나오는 것이 아니라 우측으로 붙어서 나오도록 처리
			= float 또는 inline-block
			2. 서브메뉴를 숨김
			= display:none
			3. 메뉴에 마우스가 올라가면 서브메뉴가 표시
			= :hover
			4. 서브메뉴는 연관배치를 하지 말아야 함
			= position:absolute;
		*/
		.menu, .menu ul {
			margin:0;
			padding:0;
			list-style: none;
		}
		.menu > li {
			display: inline-block;
			position: static;
		}
		.menu ul {
			display:none;
			position:absolute;
		}
		.menu li:hover > ul {
			display:block;
		}
	</style>
</head>
<body>
	<!-- 메뉴 -->
	<ul class="menu">
		<li>
			<a href="#">메뉴1</a>
			<ul>
				<li><a href="#">서브1</a></li>
				<li><a href="#">서브2</a></li>
				<li><a href="#">서브3</a></li>
				<li><a href="#">서브4</a></li>
			</ul>
		</li>
		<li>
			<a href="#">메뉴2</a>
			<ul>
				<li><a href="#">서브1</a></li>
				<li><a href="#">서브2</a></li>
				<li><a href="#">서브3</a></li>
				<li><a href="#">서브4</a></li>
			</ul>
		</li>
		<li>
			<a href="#">메뉴3</a>
			<ul>
				<li><a href="#">서브1</a></li>
				<li><a href="#">서브2</a></li>
				<li><a href="#">서브3</a></li>
				<li><a href="#">서브4</a></li>
			</ul>
		</li>
		<li>
			<a href="#">메뉴4</a>
			<ul>
				<li><a href="#">서브1</a></li>
				<li><a href="#">서브2</a></li>
				<li><a href="#">서브3</a></li>
				<li><a href="#">서브4</a></li>
			</ul>
		</li>
	</ul>
</body>
</html>
