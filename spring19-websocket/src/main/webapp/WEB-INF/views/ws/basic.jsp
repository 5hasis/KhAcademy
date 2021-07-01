<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>BasicServer 연결 예제</h1>

<button id="connect">연결</button>
<button id="disconnect">종료</button>

<script src="http://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
		//목표 : 준비한 WebSocketBasicServer에 접속 및 종료할 수 있는 js 코드 작성
		//= Javascript에 내장된 WebSocket API를 사용
		$("#connect").click(function(){
			var uri = "ws://localhost:8080/spring19/basic";
			var socket = new WebSocket(uri);
			console.log(socket);
		});
		
	});
</script>