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
			5. 메뉴바에 배경색 부여
			6. 모든 메뉴항목에 여백과 폭 설정
			7. 서브메뉴(ul)에 top, left, right, bottom을 줘서 간격을 일치
			= absolute에 top, left를 부여하면 기본적으로 페이지를 기준으로 위치가 설정된다
			= 만약 바깥영역이 relative, absolute, fixed 중 하나라면 바깥영역을 기준으로 위치가 설정된다.
			8. 글자 또는 메뉴 hover 설정 등을 구현
		*/
		.menu, .menu ul {
			margin:0;
			padding:0;
			list-style: none;
			background-color: #636e72;
		}
		.menu > li {
			display: inline-block;
			position: relative;
		}
		.menu ul {
			display:none; 
			position:absolute;
			left:0;
			top:53px; 
		}
		.menu li:hover > ul {
			display:block;
		}
		.menu li {
			padding:1rem;
			width:150px;
		}
		.menu li:hover {
			background-color:#2d3436;
		}
		.menu li > a {
			color:white;
			text-decoration: none;
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