<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//실제 context path를 구하는 명령
	//=템플릿 페이지의 모든 경로는 절대 경로로 작성해야함
	String root = request.getContextPath();

	//--------------------------------------
	//회원 로그인 판정 코드
	//--------------------------------------
	//= 세션에 memberNo가 null이 아니면 로그인 상태로 간주
	//= 세션에는 무슨 데이터든 들어갈 수 있기 때문에 저장을 Object 형태로 업캐스팅하여 수행
	Integer memberNo = (Integer)session.getAttribute("memberNo"); //다운캐스팅
	boolean isLogin = memberNo != null;
	
%>    

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>내가 만든 홈페이지</title>
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/common.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/menu.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/layout.css">
	<link rel="stylesheet" type="text/css" href="<%=root%>/css/test.css">
	<style>
		
	</style>
</head>
<body>
	<main>
		<header>
			<h1>홈페이지 1달만에 박살내기</h1>
		</header>
		<nav>
			<!-- 메뉴 -->
			<ul class="menu">
				<%if(isLogin){ %>
				<li>
					<a href="#">상품 관리</a>
					<ul>
						<li><a href="<%=root%>/product/productInsert.jsp">상품 등록</a></li>
						<li><a href="<%=root%>/product/productList.jsp">상품 목록</a></li>
						<li><a href="<%=root%>/product/productRank.jsp">상품 검색(1)</a></li>
						<li><a href="<%=root%>/product/productSearch.jsp">상품 검색(2)</a></li>
					</ul>
				</li>
				<%} %>
				<li>
					<a href="#">아이템 관리</a>
					<ul>
						<li><a href="<%=root%>/item/itemInsert.jsp">아이템 등록</a></li>
						<li><a href="<%=root%>/item/itemList.jsp">아이템 목록</a></li>
						<!-- <li><a href="item/itemList.jsp">아이템 목록</a></li> -->
					</ul>
				</li>
				<li>
					<a href="#">회원 기능</a>
					<ul>
						<%if(isLogin) {%>
						<li><a href="<%=root%>/member/logout.kh">로그아웃</a></li>
						<li><a href="<%=root%>/member/myinfo.jsp">내 정보 보기</a></li>
						<li><a href="#">회원 조회/검색</a></li>
						<%}else{ %>
						<li><a href="<%=root%>/member/join.jsp">회원 가입</a></li>
						<li><a href="<%=root%>/member/login.jsp">로그인</a></li>
						<%} %>
					</ul>
				</li>
				<li>
					<a href="#">자유게시판</a>
					<ul>
						<li><a href="<%=root%>/board/boardWrite.jsp">게시글 작성</a></li>
						<li><a href="<%=root%>/board/boardList.jsp">게시글 목록</a></li>
						
					</ul>
				</li>
			</ul>
		</nav>
		<section>