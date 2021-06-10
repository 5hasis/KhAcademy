<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>나이 : <%=request.getAttribute("age")%></h1>
<h1>요금 : <%=request.getAttribute("fare")%></h1>

<h1>나이 : ${age}</h1>
<h1>요금 : ${fare}</h1>