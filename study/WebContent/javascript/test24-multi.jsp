<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script>
		function check(){
			var checkbox = ;
			document.qeurySelector(".check-all").addEventListener("click", function(){
				var checkbox = document.querySelectorAll(".checkbox");
				
				for(var i = 0; i < checkbox.length; i++){
					checkbox[i].checked = true;
				}
			});

		}
	</script>
</head>
<body>
	<button class="check-all">전체 선택</button>
	<hr>
	<input type="checkbox" class="check-item" id="c1"><label>사과</label>
	<input type="checkbox" class="check-item" id="c2"><label>바나나</label>
	<input type="checkbox" class="check-item" id="c3"><label>파인애플</label>
</body>
</html>