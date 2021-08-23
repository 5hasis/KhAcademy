<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트 함수 다루기</title>
	<script>
		//함수(Function) : 코드를 보관하고 불러와서 실행할 수 있는 독립적인 단위(코드 저장소)
		//= 자바스크립트는 접근제한 키워드가 없다
		//= 데이터 구분이 없다(따라서 반환형을 적지 않고, 매개변수의 형태도 적지 않는다)
		//= 이름의 충돌을 조심해야 한다(모든 자바스크립트는 공유된다)
		function test(){
			console.log("테스트");
		}
	</script>
</head>
<body>
	<!-- 
		이벤트 바인딩 : 특정 태그에 특정 상황에 실행시킬 코드를 연결하는 것
		= (버튼)을 (클릭)하면 (test실행코드)를 실행하라!
		= (input[type=button])의 (onclick) 상황일 경우 (test();)를 실행하세요!
	 -->
	<input type="button" value="눌러보세요" onclick="test();">
</body>
</html>
