<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="productDto" items="${productList}"> <!-- requestScope.productList 스코프정보는 생략가능  -->
	<div>
		${productDto.no}
		${productDto.name}
		${productDto.type}
		${productDto.price}
		${productDto.made}
		${productDto.expire}
	</div>
</c:forEach>