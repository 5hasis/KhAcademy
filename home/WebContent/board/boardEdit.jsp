<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int boardNo = Integer.parseInt(request.getParameter("boardNo"));
	BoardDao boardDao = new BoardDao(); 
	BoardDto boardDto = boardDao.get(boardNo);
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
		//목표 : 시작하자마자 말머리를 boardDto의 값으로 설정(이 코드는 자바코드가 아님을 유의할 것)
		$("select[name=boardHeader]").val("<%=boardDto.getBoardHeaderString()%>");
	});
</script>

<div class="container-900">
	<div class="row">
		<h2>게시글 수정</h2>
	</div>
	
	<!-- 보내야 할 항목 4개, 사용자가 고칠 수 있는 항목 3개, 히든 1개 -->
	<form action="boardEdit.kh" method="post">
		<input type="hidden" name="boardNo" value="<%=boardDto.getBoardNo()%>">
	
		<div class="row text-left">
			<label>말머리</label>
			<select name="boardHeader" class="form-input form-input-inline">
				<option value="">선택하세요</option>
				<option>공지</option>
				<option>정보</option>
				<option>자유</option>
				<option>유머</option>
			</select>
		</div>
		
		<div class="row text-left">
			<label>제목</label>
			<input type="text" name="boardTitle" value="<%=boardDto.getBoardTitle()%>" class="form-input">
		</div>
		
		<div class="row text-left">
			<label>내용</label>
			<textarea name="boardContent" class="form-input" rows="15"><%=boardDto.getBoardContent()%></textarea>
		</div>
	
		<div class="row">
			<input type="submit" value="수정" class="form-btn">
		</div>
	
	</form>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>