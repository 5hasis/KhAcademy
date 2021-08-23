<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//superNo가 파라미터에 존재한다면 답글이라고 판정
	boolean isReply = request.getParameter("superNo") != null;
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div class="container-900">
	<div class="row">
		<%if(isReply){ %>
		<h2>답글 작성</h2>
		<%} else { %>
		<h2>게시글 등록</h2>
		<%} %>
	</div>
	
	<form action="boardWrite.kh" method="post">
		<%if(isReply){ %>
		<!-- 답글일 경우에는 등록에 필요한 추가 정보(superNo)를 전송하도록 조건부 태그 생성 -->
		<input type="hidden" name="superNo" value="<%=request.getParameter("superNo")%>">
		<%} %>
	
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
			<input type="text" name="boardTitle" class="form-input">
		</div>
		
		<div class="row text-left">
			<label>내용</label>
			<textarea name="boardContent" rows="15" class="form-input"></textarea>
		</div>
		
		<div class="row">
			<input type="submit" value="작성" class="form-btn form-btn-positive">
		</div>
	</form>
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>