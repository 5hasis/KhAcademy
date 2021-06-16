<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<div class="container-600">
	<div class="row">
		<h2>나의 정보</h2>
	</div>
	<div class="row">
		<table class="table table-border">
			<tr>
				<th>회원번호</th>
				<td>${memberDto.getMemberNo()}</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>${memberDto.getMemberId()}</td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td>${memberDto.getMemberNick()}</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>${memberDto.getMemberBirth()}</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>${memberDto.getMemberPhone()}</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>${memberDto.getMemberEmail()}</td>
			</tr>
			<tr>
				<th>등급</th>
				<td>${memberDto.getMemberGrade()}</td>
			</tr>
			<tr>
				<th>포인트</th>
				<td>${memberDto.getMemberPoint()}</td>
			</tr>
			<tr>
				<th>가입일</th>
				<td>${memberDto.getMemberJoin()}</td>
			</tr>
		</table>
	</div>
	
	<!-- 이용 가능한 메뉴 구성 -->
	<div class="row">
		<a href="${pageContext.request.contextPath}/member/change_pw" class="link-btn">비밀번호 변경</a>
		<a href="<%=request.getContextPath()%>/member/myedit.jsp" class="link-btn">개인정보 변경</a>
		<a href="${pageContext.request.contextPath}/member/exit" class="link-btn">회원 탈퇴</a>
	</div>
</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>

