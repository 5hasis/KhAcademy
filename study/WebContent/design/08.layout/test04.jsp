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
			border:1px solid transparent;
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
			background-color:lightgray;
			font: bold;
		}
		section::after {
			content:"";
			display:block;
			clear: both;
		}
		
		header {
			min-height: 100px;
			padding:10px 0px;
			background-color:rgb(50,171,223);
		}
		article {
			float:left;
			width:80%;
			min-height:500px;
		}
		footer {
			min-height:50px;
			background-color:rgb(50,171,223);
		}
		.float-container{
			background-color:rgb(157,196,223);
		}
		.float-container a {
			margin-left:0.5rem;
			padding-top:0.5rem;
			padding-bottom:0.5rem;
			padding-left:1rem;
			text-align:center;
			display:inline-block;
		}
		.side-menu{
			color:black;
			font:20px bold;
		}
		.side-menu a{
			text-decoration:none;
			padding:10px;
			display:block;
		}
		.form-input{
			width:50%;
			border:1px solid lightgray;
			border-radius:5px;
		}
		.form-btn{
			width:100px;
			background-color:rgb(50,171,223);
			color:white;
			border-radius:5%;
		}
		.table{
			margin:30px 0px;
		}
		.table.table-border > thead > tr > th, 
		.table.table-border > thead > tr > td{
			background-color:lightgray;
		}
		.pagination-list > li {
			border-radius:10%;
			background-color:lightgray;
		}
		.pagination-list > li > a {
			color:black;
		}
		.pagination-list > li:hover,
		.pagination-list > li.on {
			border-radius:10%;
			border:1px solid rgb(50,171,223);
			background-color:rgb(50,171,223);
		}
		.pagination-list > li:hover > a,
		.pagination-list > li.on > a {
			color:white;
		}
		.search-select{
			width:200px;
			padding:0.5rem;
			border:1px solid lightgray;
			border-radius:5px;
		}
		#book-list{
			font:35px bold;
			padding:10px 0px;
		}
	</style>
</head>
<body>
	<!-- 가장 바깥 영역 -->
	<main>
		<header>
			<h2 class="text-center">도서정보 관리 프로그램 ver 1.0</h2>
		</header>
		
		<!-- 컨텐츠영역 -->
		<section>
		<div class="float-container">
			<div class="menu">
				<a href="#">도서등록</a>
				<a href="#">도서목록조회/수정</a>
				<a href="#">도서주문등록</a>
				<a href="#">도서주문조회</a>
				<a href="#">매출조회</a>
				<a href="#">홈으로</a>
			</div>
		</div>
			<!-- 사이드영역 -->
			<aside>
			<div class="container-200">
				<div class="side-menu text-left">
					<p>관리메뉴</p>
					<a href="#">-주문조회</a>
					<a href="#">-재고현황</a>
					<a href="#">-재고현황</a>
					<a href="#">-거래처현황</a>
				</div>
			</div>
			</aside>
			<article>
				<div class="container-800">
				<div class="row text-center" id="book-list">도서주문조회</div>
				<form action="" method="post">
					<select name="serch" class="search-select">
					    <option value="" selected>검색분류</option>
					</select>
					<input type="text" placeholder="내용을 입력해주세요" class="form-input">
					<input type="submit" value="검색" class="form-btn">
					
				</form>
				
				
				<div class="row">
					<table class="table table-border"> 
						<thead>
							<tr>
								<th>주문일</th>
								<th>주문순서</th>
								<th>도서번호</th>
								<th>도서수량</th>
								<th>판매금액</th>
								<th>주문자</th>
							</tr> 
						</thead>
						
						<tbody>
							<tr>
								<td>2019-09-27</td>
								<td>1</td>
								<td>200002</td>
								<td>5</td>
								<td>58,500</td>
								<td>뽀로로</td>
							</tr>
							<tr>
								<td>2019-09-27</td>
								<td>2</td>
								<td>100001</td>
								<td>1</td>
								<td>14,400</td>
								<td>뽀로로</td>
							</tr>
							<tr>
								<td>2019-09-22</td>
								<td>1</td>
								<td>200002</td>
								<td>3</td>
								<td>35,100</td>
								<td>파라오</td>
							</tr>
							<tr>
								<td>2019-09-22</td>
								<td>2</td>
								<td>300001</td>
								<td>15</td>
								<td>513,000</td>
								<td>뽀로로</td>
							</tr>
							<tr>
								<td>2019-09-22</td>
								<td>3</td>
								<td>300001</td>
								<td>12</td>
								<td>410,400</td>
								<td>타잔</td>
							</tr>
							<tr>
								<td>2019-09-22</td>
								<td>4</td>
								<td>300002</td>
								<td>1</td>
								<td>54,000</td>
								<td>슈퍼맨</td>
							</tr>
						</tbody>
					</table>
				</div>
				
				<ol class="pagination-list text-center">
					<li><a href="#">&lt;</a></li>
					<li><a href="#">1</a></li>
					<li class="on"><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">&gt;</a></li>
				</ol>
				
				</div>
			</article>
		</section>
		
		<footer>
			<div class="row text-center">
				KH정보교육원 황인빈 강사 &copy; 2021 All rights reserved.
			</div>
		</footer>
	</main>
</body>
</html>
