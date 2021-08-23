<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jQuery</title>
	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
	
	</style>
	
<!-- 	개발할 때는 uncompressed 버전, 개발 후 배포시에는 compressed(minify) 버전을 사용 -->
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<!-- 	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
	<script>
		//jQuery는 Javascript를 개량한 라이브러리
		//= 코드 스타일이 유사
		
		//자바스크립트는 window에 load이벤트 시점만 되어도 사용하는데 문제가 없음.
		window.addEventListener("load", function(){
			
		});
		
		//jQuery는 자바스크립트 뿐 아니라 불러온 jQuery 라이브러리도 사용할 준비가 끝나야 함
		//= jQuery에서 제공하는 이벤트 중에 ready라는 이벤트 시점이 되어야 사용하는데 문제가 없음.
		//= jQuery는 모든 구문이 "대상을 선택"하면서부터 시작하게 됨.
		//= jQuery라고 매번 쓰기는 너무 기니까 jQuery 대신 $라는 별칭을 사용하도록 되어 있음.
		//= 최초에는 무조건 문서(document)가 준비되어야 하므로 굳이 사용하지 않아도 자동 작성해줌.
		
		//같은 코드
		//jQuery(window).on("load", function(){
		//jQuery(document).on("ready", function(){
		//jQuery(document).ready(function(){
		//$(document).ready(function(){
		//$().ready(function(){
		$(function(){
			console.log("jQuery 준비 완료!");
		});
	</script>
</head>
<body>

</body>
</html>

