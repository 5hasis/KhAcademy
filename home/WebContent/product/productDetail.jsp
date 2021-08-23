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
		<h2>상품 상세정보</h2>
	</div>
	
	<div class="row">
		<table class="table table-border">
			<tr>
				<th width="25%">상품 번호</th>
				<td><%=productDto.getNo()%></td>
			</tr>
			<tr>
				<th width="20%">상품 이름</th>
				<td><%=productDto.getName()%></td>
			</tr>
			<tr>	
				<th>상품 판매가</th>
				<td><%=productDto.getPrice()%>원</td>
			</tr>
			<tr>	
				<th>상품 제조일</th>
				<td><%=productDto.getMade()%>원</td>
			</tr>
			<tr>	
				<th>상품 유통기한</th>
				<td><%=productDto.getExpire()%>원</td>
			</tr>
		</table>
	</div>
	
	<div class="row text-right">
		<a href="productList.jsp" class="link-btn">목록</a>
		<a href="productEdit.jsp?productNo=<%=productNo%>" class="link-btn">수정</a>
		<a href="productDelete.kh?productNo=<%=productNo%>" class="link-btn">삭제</a>	
	</div>

</div>

<jsp:include page="/template/footer.jsp"></jsp:include>