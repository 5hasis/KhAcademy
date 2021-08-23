<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>입력창 스타일링</title>
	<style>
		
		/* 입력창 선택 */
		input:first-child {}
		input:nth-child(1) {}
		input[type=text] {}
		input[name=keyword] {}
		input[id=keyword-input]{}
		input#keyword-input{}
		#keyword-input{}
		input[class=input-item]{}
		input.input-item{}
		.input-item{
			/* 테두리 스타일 : border- */
			border-color: green;
			border-style: solid;
			border-width: 2px;
			border-radius: 5px; 
			
			/* 
				여백 스타일 : 
					- margin(외부여백) : 테두리 바깥쪽 여백
					- padding(내부여백) : 테두리 안쪽과 내용물 사이의 여백
					
					- padding:5px; 						= 전체 내부여백을 5px로 설정
					- padding:5px 10px;				= 상하 5px , 좌우 10px로 설정
					- padding:1px 2px 3px 4px;		= 시계방향으로 1px, 2px, 3px, 4px 부여(12시부터)
			*/
			padding: 10px;
			
			/*
				글꼴 스타일 : font-
				- 크기 설정은 px처럼 고정값으로 할 수도 있고, rem 처럼 비율로 설정할 수도 있다.
				- rem은 root 글씨의 세로 길이를 말한다
			*/
			font-family: 빙그레체;
			font-size: 20px;
			
			/*
				크기 속성 : 
				- width : 폭. px또는 %로 지정
				- height : 높이. px로 지정 (%는 적용 안되는 경우가 많음)
			*/
			width:250px;
		}
	</style>
</head>
<body>

	<form action="?" method="get">
		
		<input id="keyword-input" class="input-item" type="text" name="keyword" placeholder="무엇을 찾으세요?">
		
		<input class="input-item" type="submit" value="검색">
		
	</form>

</body>
</html>