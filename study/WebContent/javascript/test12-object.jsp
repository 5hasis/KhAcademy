<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>자바스크립트의 내장객체</title>
	<script>
		/*
			Javascript는 브라우저상의 기능을 구현하기 위한 언어이다.
			= 브라우저를 제어하거나 정보를 얻어낼 수 있어야 한다
			
			window : 창을 제어할 수 있도록 제공되는 내장객체(생략가능)
				- alert() : 알림창
				- confirm() : 확인창
				- open() : 새탭/새창
			location : 주소를 제어할 수 있도록 제공되는 내장객체
				- href : 주소 정보를 가진 속성
				- reload() : 새로고침
			history : 방문이력을 제공하는 내장객체
				- back() : 뒤로 1페이지 이동(가능할 경우에만)
				- go() : 특정 위치로 이동(가능할 경우에만)
				- forward() : 앞으로 1페이지 이동(가능할 경우에만)
		*/
		
		console.log(window);
		console.log(window.location);
		console.log(location);
		console.log(window.history);
		console.log(history);
		console.log(window.document);
		console.log(document);
		
		function windowTest1(){
			window.alert("안녕하세요");
		}
		function windowTest2(){
			var choice = window.confirm("네이버로 이동하시겠습니까?");
			console.log(choice);
			if(choice){
				console.log("네이버로 이동합니다");
			}
		}
		function windowTest3(){
// 			var choice = window.confirm("정말 이동하시겠습니까?");
// 			if(choice){
// 				return true;
// 			}
// 			else{
// 				return false;
// 			}
			return window.confirm("정말 이동하시겠습니까?");
		}
		function windowTest4(){
			window.open("http://www.naver.com");
		}
		function windowTest5(){
// 			window.open("주소", "아이디", "창옵션");
			window.open("http://www.naver.com", "naver", "width=400, height=400");
		}
		
		function locationTest1(){
			location.href = "http://www.sysout.co.kr/";//페이지 주소 변경(이동)
// 			location = "http://www.sysout.co.kr/";//약식표현(정확한 표현이 아니지만 가능)
		}
		function locationTest2(){
			location.reload();//새로고침
		}
		
		function historyTest1(){
// 			history.back();
			history.go(-1);
		}
		
		function historyTest2(){
// 			history.forward();
			history.go(1);
		}
		
		function documentTest1(){
// 			Javascript에는 선택 명령이 여러가지가 있다.
// 			1. 모든 브라우저와 호환되는 명령
// 			var textarea = document.getElementById("test1");//ID로 선택(단수)
// 			var textarea = document.getElementsByClassName("test2");//Class로 선택(복수)
// 			var textarea = document.getElementsByTagName("textarea");//태그로 선택(복수)
// 			2. CSS 선택자를 이용하는 명령
			var textarea = document.querySelector(".test2");//CSS선택(단수)
// 			var textarea = document.querySelectorAll(".test2");//CSS선택(복수)
			
			console.log(textarea);
			textarea.value = "documentTest1에서 작성한 내용";
			textarea.rows = 5;
			textarea.cols= 50;
			
// 			자바스크립트에서 스타일을 직접 추가할 수 있다(권장하지 않음. 이럴꺼면 CSS는 왜배우나?)
// 			textarea.style = "color:red;";//style이라는 속성을 설정
// 			textarea.style.color = "red";//style 요소 중에서 color를 설정(그나마 권장)
// 			자바스크립트에서 클래스를 확인/추가/제거할 수 있다(권장)
		}
		
		function documentTest2(){
			var textarea = document.querySelector(".test2");
// 			textarea.style.textAlign = "left";//style을 직접 수정(비추천)
// 			console.log(textarea.classList);
// 			textarea.classList.remove("left");
// 			textarea.classList.remove("center");
// 			textarea.classList.remove("right");
			textarea.classList.remove("left", "center", "right");
			textarea.classList.add("left");//textarea의 class관리도구를 이용해 left를 추가
		}
		function documentTest3(){
			var textarea = document.querySelector(".test2");
			textarea.classList.remove("left", "center", "right");
			textarea.classList.add("center");
		}
		function documentTest4(){
			var textarea = document.querySelector(".test2");
			textarea.classList.remove("left", "center", "right");
			textarea.classList.add("right");
		}
	</script>
	<style>
		.left{
			text-align: left;
		}
		.center {
			text-align: center;
		}
		.right {
			text-align:right;
		}
	</style>
</head>
<body>
	<button onclick="windowTest1();">알림창</button>
	<button onclick="windowTest2();">확인창</button>
	<a href="http://www.naver.com" onclick="return windowTest3();">네이버로 이동</a>
	<button onclick="windowTest4();">새탭</button>
	<button onclick="windowTest5();">새창</button>
	
	<hr>
	
	<button onclick="locationTest1();">이동</button>
	<button onclick="locationTest2();">새로고침</button>
	
	<hr>
	
	<button onclick="historyTest1();">뒤로가기</button>
	<button onclick="historyTest2();">앞으로가기</button>
	
	<hr>
	
	<button onclick="documentTest1();">테스트1</button>
	
	<textarea id="test1" class="test2"></textarea>
	
	<button onclick="documentTest2();">왼쪽정렬</button>
	<button onclick="documentTest3();">가운데정렬</button>
	<button onclick="documentTest4();">오른쪽정렬</button>
</body>
</html>


