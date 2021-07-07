<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>결제 확인 페이지(buy2.jsp)</h1>

<c:forEach var="productDto" items="${list}">
	<div>
		<b>${productDto.name}</b>
		(${productDto.price}원)
	</div>
</c:forEach>