<%@page import="study.beans.ItemDto"%>
<%@page import="study.beans.ItemDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
//  수정하려면 기존 정보를 표시해야하므로 상세 페이지처럼 "번호를 이용한 조회" 작업을 수행해야함
	int itemNo = Integer.parseInt(request.getParameter("itemNo"));

	ItemDao itemDao = new ItemDao();
	ItemDto itemDto = itemDao.get(itemNo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이템 정보 수정</title>
</head>
<body>
	<h1>아이템 정보 수정</h1>

	<form action="itemEdit.kh" method="post">
	
		<!-- readOnly -->
			  <input type="hidden" name="itemNo" value="<%=itemDto.getItemNo()%>"><br><br>
		이름 : <input type="text" name="itemName" value="<%=itemDto.getItemName()%>"><br><br>
		가격 : <input type="text" name="itemPrice" value="<%=itemDto.getItemPrice()%>"><br><br>
		
		<input type="submit" value="수정">
		
	</form>
</body>
</html>