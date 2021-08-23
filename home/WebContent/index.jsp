<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jsp 액션태그(JSP 페이지에서만 사용 가능한 태그)를 활용한 동적 include -->
<jsp:include page="/template/header.jsp"></jsp:include>

<%
	/* 컴파일 이후에 합치기 때문에 header에 존재하는 변수명 써두 갠춘 */
	String root = "hello";
%>
			

<div class="container-600">
	<div class="row">
		<h2>어서와 내 홈페이지는 처음이지?</h2>
	</div>
	<div class="row">
		<img src="image/dog.png" width="500" height="350">
	</div>
</div>



<jsp:include page="/template/footer.jsp"></jsp:include>