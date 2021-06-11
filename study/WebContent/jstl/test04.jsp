<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
	JSTL을 이용한 조건부 처리
	= key라는 이름의 파라미터가 있다고 가정하고 조건을 구성
	 
	1. c:if -1회성 조건부 태그, c:else는 없음!
	2. c:choose
		- c:when : case 역할을 수행
		- c:otherwise : default 역할을 수행
 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${not empty pram.key}">
	<h1>현재 검색어 : ${param.key }</h1>
</c:if>
<c:if test="${empty pram.key}">
	<h1>입력된 검색어가 없습니다.</h1>
</c:if>

<c:choose>
	<c:when test="${not empty pram.key}">
		<h1>현재 검색어 : ${param.key }</h1>
	</c:when>
	<c:otherwise>
		<h1>입력된 검색어가 없습니다.</h1>
	</c:otherwise>
</c:choose>