<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div class="container-600">
	<div class="row">
		<h2>상품 정보 입력</h2>
	</div>
	
	<form action="productInsert.kh" method="post">
	
		<div class="row text-left">
			<label>상품 이름</label>
			<input type="text" name="productName" required class="form-input">
		</div>
			
		<div class="row text-left">
			<label>상품 분류</label>
			<select name="productType" class="form-input form-input-underline" required>
				<option value="">선택하세요</option>
				<option>과자</option>
				<option>아이스크림</option>
				<option>주류</option>
				<option>사탕</option>
			</select>
		</div>
		
		<div class="row text-left">
			<label>상품 판매가</label>
			<input type="text" name="productPrice" required class="form-input">
		</div>
		
		<div class="row text-left">
			<label>상품 제조일</label>
			<input type="date" name="productMade" required class="form-input">
		</div>
		
		<div class="row text-left">
			<label>상품 유통기한</label>
			<input type="date" name="productExpire" required class="form-input">
		</div>
		
		<div class="row">
			<input type="submit" value="등록" class="form-btn form-btn-positive">
		</div>
		
	</form>
	
</div>

<jsp:include page="/template/footer.jsp"></jsp:include>