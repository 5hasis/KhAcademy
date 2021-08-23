<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/design/common.css">
	<style>
	</style>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script>
		$(function(){
			$(".btn").on("click",function(){
				//var chk_str=[];
				var chk_str="";
				
				$(".check-subject").each(function(){
					
					var current = $(this).prop("checked"); //true or false
					
					if(current){
						var subject = $(this).data("subject");
						chk_str += subject+"<br>";
						//chk_str.push(subject);
					}
					
					console.log(chk_str);

				});
				
				$(this).next(".show").html(chk_str);
				$(this).next(".show").css("border","2px solid red");
			});
		});
		
	</script>
</head>
<body>
	<div class="container-500">
		<h2>가장 재미있었던 과목은? (복수 선택 가능)</h2>
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
		<input type="submit" value="제출" class="btn">
		<p class="show"></p>
	</div>

</body>
</html>