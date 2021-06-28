<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<button id="bt1">동기 요청</button>
<button id="bt2">비동기 요청</button>
<div id="result"></div>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
	$(function(){
		//동기 요철 버튼을 누르면 /data/test1로 이동.
		$("#bt1").click(function(){
			//location.href="http://localhost:8080/spring18/data/test1";
			//location.href="${pageContext.request.contextPath}/data/test1";
			location.href = "../data/test1";
		});
		
		//비동기 요청버튼을 누르면 /data/test1의 내용을 가져옴.
		$("#bt2").click(function(){
			
			$.ajax({
				url:"../data/test1",
				success:function(resp){
					$("#result").html(resp);
				}
			});
		});
	});
</script>