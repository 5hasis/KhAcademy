<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	
	<h1>회원 정보 입력</h1>
	
	<!-- 
		form에 method를 지정하여 전송 형태를 설정할 수 있다.
		- GET : 기본값이며, 주소의 ? 이후에 데이터를 첨부하는 방식. 주소를 이용한 데이터 전달 방식
			- 장점 : 간편하며 다양한 종류의 태그로 쉽게 사용 가능(ex : form , a)
			- 단점 : 주소는 최대 256 byte 까지만 작성이 가능하므로 전송 가능한 데이터 양의 제한이 있다
		- POST : 주소가 아니라 HTTP BODY 를 이용하여 데이터를 전달하는 방식
			- 장점 : 전송 양이 무한대이다. 따라서 데이터가 많거나, 파일을 보낼 때 사용
			- 단점 : 
				- 반드시 Form 이 있어야 한다.(자바스크립트를 배우면 이야기가 달라진다)
				- 전송되는 데이터는 ASCII code로 전송된다(즉, 유니코드가 깨진다)
	 -->
	
	<form action="memberInsert.kh" method="post">
		
		<table>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="memberId" required>
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="memberPw" required>				
				</td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td>
					<input type="text" name="memberNick" required>
				</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>
					<input type="date" name="memberBirth" required>
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>
					<input type="tel" name="memberPhone" required>					
				</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>
					<input type="email" name="memberEmail">					
				</td>
			</tr>
			<tr>
				<th colspan="2" align="right">
					<input type="submit" value="가입">		
				</th>
			</tr>
		</table>
		
	</form>
	
</body>
</html>