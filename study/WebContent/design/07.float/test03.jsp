<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>float 이해하기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		/* 
			float 속성을 부여하는 순간 기존의 배치에서 벗어나 공중에 뜨게 된다.
			- 속성값을 이용해서 기준이 되는 방향을 정해주면 해당 방향쪽으로 붙는다.
		*/
		.multi-container {
			border:1px dotted black;
			float:right;
			width:50%; 
		}		
		
		/*
			float 스타일(다단 레이아웃)
		
			가상선택자(Virtual Selector)
			- 존재하지 않는 영역을 만들어서 사용할 수 있도록 지원하는 선택자
			- ::before 는 해당 영역의 시작지점을 말한다
			- ::after는 해당 영역의 종료지점을 말한다
			
			1. 존재하지 않는 영역이므로 존재하도록 만드는 것이 첫 번째로 수행해야 하는 작업
				- content : 영역에 글자를 작성할 수 있다.
			2. display를 block으로 설정해서 한 줄을 차지하도록 설정
			3. 영역이 한 줄에 걸쳐서 생성되었으므로, 해당 영역에 clear 설정
		*/
		.float-container::after {
			content:"";
			display:block;
			clear:both;
		}
	</style>
</head>
<body>

	<div style="background-color:yellow;">테스트 코드1</div>

	<!-- 해결책2 : float 전용 공간을 생성해서 해당 영역이 끝나면 자동으로 clear가 되도록 처리 -->
	
	<div class="float-container">
		<div class="multi-container">111</div>
		<div class="multi-container">222</div>
	</div>
	
	<div style="background-color:lightgray;">테스트 코드2</div>

</body>
</html>