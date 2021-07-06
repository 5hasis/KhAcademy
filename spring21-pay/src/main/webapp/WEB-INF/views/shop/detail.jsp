<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>상품 상세</h1>

<ul>
	<li>상품번호 : ${productDto.no}</li>
	<li>상품이름 : ${productDto.name}</li>
	<li>상품분류 : ${productDto.type}</li>
	<li>상품가격 : ${productDto.price}</li>
	<li>제조일자 : ${productDto.made}</li>
	<li>유통기한 : ${productDto.expire}</li>
</ul>



