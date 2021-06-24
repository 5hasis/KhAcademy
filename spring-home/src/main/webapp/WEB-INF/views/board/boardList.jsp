<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container-1100">

	<div class="row">
		<h2>자유 게시판</h2>
	</div>
	
	<div class="row text-right">
		<a href="boardWrite.jsp" class="link-btn">글쓰기</a>
	</div>
	
	<div class="row">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th width="40%">제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
					<th>좋아요</th>
					<th>싫어요</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="boardDto" items="${boardList}">
					<tr>
					<td>${boardDto.getBoardNo()}</td>
					<td class="text-left">
						
						<!-- 말머리가 있는 경우에만 말머리를 출력한다 -->
						<c:if test="${not empty boardDto.getBoardHeader()}">
						[${boardDto.getBoardHeader()}]
						</c:if>
						
						<!-- 제목을 누르면 상세보기 페이지로 이동한다 -->
						<a href="boardDetail.jsp?boardNo=${boardDto.getBoardNo()}">
							${boardDto.getBoardTitle()}
						</a>
					</td>
					<td>${boardDto.getBoardWriter()}</td>
					<td>${boardDto.getBoardTime()}</td>
					<td>${boardDto.getBoardRead()}</td>
					<td>${boardDto.getBoardLike()}</td>
					<td>${boardDto.getBoardHate()}</td>
				</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
	
	<div class="row text-right">
		<a href="boardWrite.jsp" class="link-btn">글쓰기</a>
	</div>
	
	<div class="row">
		<!-- 검색화면 구현 -->
		<form class="search-form" action="boardList.jsp" method="get">
			<input type="hidden" name="pageNo">
		
			<select name="type" class="form-input form-input-inline">
				<option value="board_title">제목만</option>
				<option value="board_writer">작성자만</option>
			</select>
			
			<input type="text" name="keyword" placeholder="검색어" class="form-input form-input-inline">
			
			<input type="submit" value="검색" class="form-btn form-btn-inline form-btn-positive">
		</form>
	</div>
	
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


