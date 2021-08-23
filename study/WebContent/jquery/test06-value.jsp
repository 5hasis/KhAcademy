<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery</title>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	
	<script>
		$(function(){
			//목표 : textarea에 입력된 글자를 div에 각각 다른 방법으로 복사
			//- textarea의 value를 읽어서 각각의 div에 innerHTML, textContet로 설정
			//- jQuery는 각각의 값들을 제어하기 위한 명령들이 존재
			//$(".test-input").input(function(){}); //없음(jQuery보다 나중에 나온 이벤트)
			$(".test-input").on("input", function(){
				//주인공 : textarea(.test-input) == this
				var content = $(this).val();
			
				//태그를 인식하냐 못하냐의 차이
				/*var div1 = document.querySelector(".copy-area1");
				div1.innerHTML = content;*/
				$(".copy-area1").html(content);
				
				/*var div2 = document.querySelector(".copy-area2");
				div2.textContent = content;*/
				$(".copy-area2").text(content);
				
			});
			
		});
	</script>
</head>
<body>
	<textarea class="test-input"></textarea>
	<div class="copy-area1"></div>
	<div class="copy-area2"></div>

</body>
</html>