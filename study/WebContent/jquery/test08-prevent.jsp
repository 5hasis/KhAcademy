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
		//목표 : 기본 이벤트 방지 작업
		//= a, form 태그처럼 따로 설정하지 않아도 기본적으로 이벤트가 제공되는 태그들을 제어하는 방법
		//= Javascript에서는 return true/false로 제어 했었으나, jQuery는 다르다
		$(function(){
			//a태그를 누르면 확인창 출력 후 확인을 눌렀을 때만 정상 진행, 아니면 기본 이벤트 차단
			$(".confirm-link").on("click", function(){
				var choice = wi<%@ page language="java" contentType="text/html; charset=UTF-8"
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
						//목표 : 기본 이벤트 방지 작업
						//= a, form 태그처럼 따로 설정하지 않아도 기본적으로 이벤트가 제공되는 태그들을 제어하는 방법
						//= Javascript에서는 return true/false로 제어 했었으나, jQuery는 다르다
						$(function(){
							//a태그를 누르면 확인창 출력 후 확인을 눌렀을 때만 정상 진행, 아니면 기본 이벤트 차단
							//= 이벤트를 설정하면 이벤트 정보 객체를 사용할 수 있다.
							//= e.preventDefault() 를 호출하면 이벤트가 차단된다.
							$(".confirm-link").on("click", function(e){
								var choice = window.confirm("정말 이동하시겠습니까?");
								if(!choice){
									e.preventDefault();//return false; 와 같은 기능이지만 이후에 추가 코드 작성이 가능
								}
							});
						});
					</script>
				</head>
				<body>
					<a class="confirm-link" href="http://www.naver.com">네이버로 이동</a>
				</body>
				</html>

					return true;
				}
				else{
					return false;
				}
			});
		});
	</script>
</head>
<body>
	<a class="confirm-link" href="http://www.naver.com">네이버로 이동</a>
</body>
</html>