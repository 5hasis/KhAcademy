<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//p라는 이름으로 페이지 번호를 받는다(없거나 이상하면 1로 설정)
	int p;
	try{
		p = Integer.parseInt(request.getParameter("p"));
	}
	catch(Exception e){
		p = 1;
	}
%>
    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Pagination 만들기</title>
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		/*
			페이지네이션(Pagination) 스타일링
			
			- 영역 내 a태그의 글자 색상 및 밑줄 제거
			- 영역 내 a태그에 표시방식 변경 및 폭 설정
			- 영역 내 a태그에 테두리 설정 및 내부 여백 설정
			- 영역 내 a태그에 글자 정렬 설정 및 hover 설정
		*/
		.pagination > a {
			color:grey;
			text-decoration: none;
			display:inline-block; 
			min-width:35px;
			
			border:1px solid transparent;
			padding:0.5rem;
			text-align: center;
		}
		.pagination > a:hover,
		.pagination > a.on {
			border:1px solid lightgray;
			color:rgb(255,85,146);
		}
	</style>
</head>
<body>
	
	<div class="pagination"> 
		<a href="#">&lt;이전</a>
		
		<%for(int i=1; i <= 10; i++){ %>
			<%if(p == i){ %>
				<a href="#" class="on"><%=i%></a>
			<%}else{ %>
				<a href="#"><%=i%></a>
			<%} %>
		<%} %>

		<a href="#">다음&gt;</a>
	</div>
	
</body>
</html>