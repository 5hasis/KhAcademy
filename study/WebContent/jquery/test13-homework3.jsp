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
		$(function(){
			//목표 : 제출버튼을 눌렀을 때 체크된 체크박스의 값을 확인 한다
			$(".test-form").submit(function(e){
				e.preventDefault();
				
				var text = "<ul>";
				$(".check-item:checked").each(function(idx){
					text += "<li>";
					text += $(this).val();
					text += "</li>";
				});
				text += "</ul>";
				$(".result").html(text);
			});
		});
	</script>
</head>
<body>
	<h2>가장 재미있는 과목은? (복수선택 가능)</h2>
	<hr>
	<form action="???" class="test-form">
		<label><input type="checkbox" class="check-item" name="subject" value="자바"><span>자바</span></label><br>
		<label><input type="checkbox" class="check-item" name="subject" value="데이터베이스"><span>데이터베이스</span></label><br>
		<label><input type="checkbox" class="check-item" name="subject" value="JSP/Servlet"><span>JSP/Servlet</span></label><br>
		<label><input type="checkbox" class="check-item" name="subject" value="HTML/CSS"><span>HTML/CSS</span></label><br>
		<label><input type="checkbox" class="check-item" name="subject" value="Javascript/jQuery"><span>Javascript/jQuery</span></label>
		<hr>
		<input type="submit" value="제출" class="submit-btn">
	</form>
	<div class="result"></div>
</body>
</html>

