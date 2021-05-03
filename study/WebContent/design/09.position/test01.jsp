<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>position 속성 다루기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		/*
			영역에 부여되는 Position 속성 이해하기
			- 위치는 크게 2가지 유형으로 정해진다
			1. 연관 배치 : 앞 태그의 위치가 현재 태그에 영향을 미치는 경우
				= 대부분의 컴포넌트가 여기에 해당됨
				= static, relative
			2. 고정 배치 : 앞 태그의 위치와 상관없이 현재 태그의 위치가 정해지는 경우
				= 공지, 광고 등 화면을 덮는 배치가 필요할 경우 사용
				= 상단 메뉴 등도 여기에 해당
				= absolute, fixed
			
			- position:static - 기본값이며, 앞 태그의 영향을 받아 위치가 결정되면 수정 불가
			- position:relative - 앞 태그의 영향을 받아 위치가 결정되지만 약간의 조정이 가능
			- position:absolute - 앞 태그의 영향을 받지 않으며, 페이지상의 특정 위치로 고정
			- position:fixed - 앞 태그의 영향을 받지 않으며 보여지는 화면의 특정 위치에 고정
				- left : 왼쪽으로부터의 간격
				- right : 오른쪽으로부터의 간격
				- top : 위쪽으로부터의 간격
				- bottom : 아래쪽으로부터의 간격
				- z-index : 배치되는 층 수
		*/
		body {
			height:50000px;
		}
		.a, .b, .c {
			width:150px;
			height:150px;
			border:1px solid black;
			position:absolute;
		}
		.a {
			background-color:#74b9ff;
			top:100px;
			left:100px;
			z-index: 3;
		}
		.b {
			background-color:#ffeaa7;
			top:200px;
			left:200px;
			z-index: 2;
		}
		.c {
			background-color:#fdcb6e;
			top:300px;
			left:300px;
			z-index: 1;
		}
	</style>
</head>
<body>
	 <div class="a"></div>
	 <div class="b"></div>
	 <div class="c"></div>
</body>
</html>
