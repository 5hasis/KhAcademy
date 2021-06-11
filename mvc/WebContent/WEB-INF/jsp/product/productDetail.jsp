<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>번호:${productDto.getNo() }</h1>
<h1>상품명:${productDto.getName() }</h1>
<h1>종류:${productDto.type }</h1>
<h1>가격:${productDto.price }</h1>
<h1>제조일:${requestScope.productDto.getMade() }</h1>
<h1>유통기한:${requestScope.productDto.getExpire() }</h1>
