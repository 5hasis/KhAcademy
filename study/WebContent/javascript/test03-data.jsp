<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트 데이터 구조</title>
	<script>
		//자바스크립트의 데이터 분류 및 변수 생성
		//= 자바스크립트는 자료형이 없다(내부적으로만 관리된다)
		//= boolean(논리), number(숫자), string(문자열), object(객체), function(함수)
		
		var a = 10;//int a = 10;
		var b = "hello";//String b = "hello";
		
		console.log(a);
		console.log(b);
		console.log(a + b);
		console.log(a * b);//NaN : Not a Number. 숫자가 아니다.
		console.log(typeof a);//a의 실제 관리형태를 알려달라!
		console.log(typeof b);//b의 실제 관리형태를 달려달라!
	</script>
</head>
<body>

</body>
</html>