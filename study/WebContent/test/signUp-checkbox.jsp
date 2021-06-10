<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script>
		$(function(){
			
			$(".signup").on("click", function(e){
				
				if($("#id").val() == $("#name").val()){
					window.alert("아이디와 이름의 값은 일치하면 안됩니다");
					e.preventDefault();
				}
				
				var count = 0;
				$(".check-subject").each(function(){
					var current = $(this).prop("checked");
					if(current){
						count += 1;
					}
				});
				
				console.log(count);
				if(count < 2){
					window.alert("취미는 2개 이상 선택하세요");
					e.preventDefault();
				}
				

				var tel = $("#tel").val();
				var regex = /^[0]\d{,3}-?([0-9]{3,4})-?([0-9]{4})$/;
				if(!regex.test(tel)){
					window.alert("전화번호 형식을 확인하세요");
					$("#tel").val("");
					$("#tel").focus();
					e.preventDefault();
				}
				if($("#tel").val() == null){
					e.preventDefault();
				}
			});
			
			
		});
	</script>
</head>
<body>
	<form action="result.html" method="post">
	
		아이디<input type="text" name="id" id="id"><br>
		이름<input type="text" id="name"><br>
		<label for ="tel">전화번호</label>
		<input type="text" name="tel" id="tel">
		<br>
		<input type="submit" value="회원가입" class="signup">
		<input type="reset" value="취소">
		
		<div class="row">
			<hr>
			<input type="checkbox" class="check-subject" id="java" data-subject="자바">
			<label for="java">자바</label> <br>
			
			<input type="checkbox" class="check-subject" id="database" data-subject="데이터베이스">
			<label for="database">데이터베이스</label> <br>
			
			<input type="checkbox" class="check-subject" id="jsp" data-subject="JSP/Servlet">
			<label for="jsp">JSP/Servlet</label> <br>
			
			<input type="checkbox" class="check-subject" id="html" data-subject="HTML/CSS">
			<label for="html">HTML/CSS</label> <br>
			
			<input type="checkbox" class="check-subject" id="js" data-subject="Javascript/jQuery">
			<label for="js">Javascript/jQuery</label> <br>
		</div>
	</form>

</body>
</html>