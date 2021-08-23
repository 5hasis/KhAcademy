<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글자길이 구하기</title>
	<script>
		//목표 : 입력이 발생하면 글자수를 갱신하는 페이지 구현
		//= <input>에 oninput 상황이 발생하면 준비한 함수를 실행
		
		function calc(){
			//var input = document.getElementById("user-input");
			var input = document.querySelector("#user-input");
			var span = document.querySelector("#length");
			
			var text = input.value;//입력된 값을 text에 저장
			var len = text.length;//text의 글자수(=배열길이)
			
			//입력창만 value를 가질 수 있다
			//입력창이 아닌 것들은 innerHTML 또는 textContent 속성을 설정해야 한다
			//= innerHTML은 설정되는 글자에서 html을 해석하여 효과를 적용한다
			//= textContent는 설정되는 글자에서 html을 무시하고 적용한다.
			span.textContent = len;//span 내부의 글자로 설정
		}
	</script>
</head>
<body>
	<input type="text" id="user-input" oninput="calc();">
	<span id="length">0</span>
</body>
</html>