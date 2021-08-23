<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>우리가 만들고 싶은 화면</title>
	<script>
		//계획 : '=' 버튼을 '클릭'하면 'test' 함수의 코드를 실행
		function test(){
			//console.log("test 함수 실행");
			
			//수행해야 할 내용
			//1. 좌측 입력창 2개에 작성된 값을 불러온다
			//2. 불러온 값을 더한다
			//3. 우측 입력창에 결과를 표시한다
			
			//태그를 불러오는 명령
			//= document.querySelector("CSS선택자");
			
			//var a = document.querySelector(".a");
			//var a = document.querySelector("#a");
			var a = document.querySelector("input[name=a]");
			var b = document.querySelector("input[name=b]");
			var c = document.querySelector("input[name=c]");
			
			//c의값 = a의값 + b의값;
			//c.value = a.value + b.value;//문자열 덧셈
			c.value = parseInt(a.value) + parseInt(b.value);//정수 변환 후 덧셈
		}
	</script>
</head>
<body>
	<input type="text" name="a" id="a" class="a">
	+
	<input type="text" name="b" id="b" class="b">
	<input type="button" value="=" onclick="test();">
	<input type="text" name="c" id="c" class="c">
</body>
</html>