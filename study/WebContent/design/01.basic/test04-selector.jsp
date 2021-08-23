<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>선택자(selector) 배우기</title>
	<style>
		/* 
			선택자(selector) : 디자인을 적용시킬 대상을 선택하기 위한 문법 
			
			태그 선택자 : 태그명을 이용하여 페이지 내의 모든 대상을 선택하는 방법(매우 위험)
			상태 선택자 : 대상을 특정하기 위해 상태를 이용하여 선택하는 방법
				ex) h1:first-child , h1:last-child , h1:nth-child(1), h1:hover, h1:focus 등
			속성 선택자 : 태그의 속성을 이용하여 선택하는 방법
				ex) h1[id=target] , input[name=memberId], 등
			아이디 선택자 : 
				- 모든 태그에는 id라는 속성을 부여할 수 있으며, id는 페이지 내에서 유일해야 한다.
				- 페이지 내에서 딱 하나만 선택하고 싶을 때 사용
				ex) h1#target , #target , 등
			클래스 선택자 : 
				- 모든 태그에는 class라는 속성을 부여할 수 있으며, 중복하여 부여가 가능하고, 여러 개 부여 가능
				- 페이지 내에서 원하는 그룹을 만들어 선택하고 싶을 때 사용
				- 태그의 종류가 달라도 묶어서 디자인을 적용할 수 있다.
				ex) h1[class=test], h1.test , .test , 등
			연계 선택자 : 
				- 특정 태그를 기준으로 하여 경로를 탐색하여 태그를 선택하는 방법
		*/
		.test {
			color:red;
			background-color: yellow;
		}
	</style>
</head>
<body>
	
	<h1 id="target">Hello Design!</h1>
	<h1>Hello Design!</h1>
	<h1 class="test">Hello Design!</h1>
	<h1 class="test">Hello Design!</h1>
	<h1>Hello Design!</h1>
	
</body>
</html>