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
			$(".submit-btn").click(function(){
				//1. 전체 체크박스 중 체크된 체크박스를 확인하여 값을 출력
				//console.log($(".check-item"));
				
				var text = "";//Java의 StringBuffer, StringBuilder 역할
				
				$(".check-item").each(function(idx){
					//console.log($(this).prop("checked"));
					//console.log($(this).is(":checked"));
					if($(this).is(":checked")){
						//console.log($(this).next().text());
						//console.log($(this).val());
						text += $(this).val();
						text += "\n";
					}
				})
				
				//window.alert(text);
				$(".result").text(text);
			});
		});
	</script>
</head>
<body>
	<h2>가장 재미있는 과목은? (복수선택 가능)</h2>
	<hr>
	<label><input type="checkbox" class="check-item" name="subject" value="자바"><span>자바</span></label><br>
	<label><input type="checkbox" class="check-item" name="subject" value="데이터베이스"><span>데이터베이스</span></label><br>
	<label><input type="checkbox" class="check-item" name="subject" value="JSP/Servlet"><span>JSP/Servlet</span></label><br>
	<label><input type="checkbox" class="check-item" name="subject" value="HTML/CSS"><span>HTML/CSS</span></label><br>
	<label><input type="checkbox" class="check-item" name="subject" value="Javascript/jQuery"><span>Javascript/jQuery</span></label>
	<hr>
	<button class="submit-btn">제출</button>
	<div class="result"></div>
</body>
</html>

