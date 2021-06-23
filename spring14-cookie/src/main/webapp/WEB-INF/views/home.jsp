<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>쿠키 예제</h1>

<!-- 
	페이지에 쿠키의 값을 EL을 통해 출력할 수 있음.
	EL에서는 cookie라는 내장객체를 통해 쿠키에 접근이 가능.
	
	<약속>
	쿠키 이름 : visit
	쿠키 값 : 방문 시각(문자열)
 -->
 
<h2>visit : ${cookie.visit}</h2>
<h2>visit : ${cookie["visit"]}</h2>

<h2>visit : ${cookie.visit.value}</h2>
<h2>visit : ${cookie["visit"].value}</h2>

<a href="create">쿠키 생성</a>
<a href="delete">쿠키 삭제</a>

<c:choose>
	<c:when test="${cookie.visit == null}">
		<h2>쿠키 없음</h2>
	</c:when>
	<c:otherwise>
		<h2>쿠키 있음</h2>
	</c:otherwise>
</c:choose>