<%@page import="home.beans.ProductDao"%>
<%@page import="home.beans.ProductDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int productNo = Integer.parseInt(request.getParameter("productNo"));
	ProductDao productDao = new ProductDao();
	ProductDto productDto = productDao.get(productNo);
%>

<jsp:include page="/template/header.jsp"></jsp:include>

<div class="container-600">
	<div class="row">
		<h2>상품 수정하기</h2>
	</div>
	
	<form action="productEdit.kh" method="post">
		<input type="hidden" name="productNo" value="<%=productDto.getNo()%>">
	
		<div class="row text-left">
			<label>상품 이름</label>
			<input type="text" name="productName" autocomplete="off" value="<%=productDto.getName()%>" class="form-input">
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
			<input type="text" name="productPrice" autocomplete="off" value="<%=productDto.getPrice()%>" class="form-input">
		</div>
		
		<div class="row text-left">
			<label>상품 제조일</label>
			<input type="text" name="productMade" autocomplete="off" value="<%=productDto.getMade()%>" class="form-input">
		</div>
		
		<div class="row text-left">
			<label>상품 유통기한</label>
			<input type="text" name="productExpire" autocomplete="off" value="<%=productDto.getExpire().substring(0, 10)%>" class="form-input">
		</div>
		
		<div class="row">
			<input type="submit" value="수정" class="form-btn form-btn-positive">
		</div>
		
	</form>

</div>

<jsp:include page="/template/footer.jsp"></jsp:include>