<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div class="container-400">
	<div class="row">
		<h2>회원가입</h2>
	</div>

<%--<form action="<%=request.getContextPath()%>/member/join.kh"> --%>
	<form action="join.kh" method="post">
		<div class="row text-left">
			<label>아이디</label>	
			<input type="text" name="memberId" placeholder="영어소문자,숫자 8~20자 이내 (중복 불가)" class="form-input form-input-underline">
		</div>
		
		<div class="row text-left">
			<label>비밀번호</label>	
			<input type="password" name="memberPw" placeholder="영어소문자,숫자,!,@,#,$ 8-16자 이내 (중복 불가)" class="form-input form-input-underline">
		</div>
		
		<div class="row text-left">
			<label>비밀번호 재확인</label>
			<input type="password" class="form-input form-input-underline"
						placeholder="동일한 비밀번호를 한번 더 입력">
		</div>
		
		<div class="row text-left">
			<label>닉네임</label>	
			<input type="text" name="memberNick" placeholder="한글 3~10자 이내 (중복 불가)" class="form-input form-input-underline">
		</div>
		
		<div class="row text-left">
			<label>생년월일</label>	
			<input type="date" name="memberBirth"  class="form-input form-input-underline">
		</div>
		
		<div class="row text-left">
			<label>전화번호</label>
			<input type="text" name="memberPhone" required class="form-input form-input-underline"
						placeholder="- 를 포함하여 입력 (예 : 010-XXXX-XXXX)">
		</div>
		<div class="row text-left">
			<label>이메일</label>
			<input type="text" name="memberEmail" class="form-input form-input-underline">
		</div>
		
		<div class="row">
			<input type="submit" value="회원 등록" class="form-btn form-btn-positive">
		</div>
		
	</form>

</div>

<jsp:include page="/template/footer.jsp"></jsp:include>