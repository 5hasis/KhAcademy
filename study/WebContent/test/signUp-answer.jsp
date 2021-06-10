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
		$(function() {
			
			$('#userId').blur(function() {
				var value = $('#userId').val().trim();
				var reg = /^[A-Z][A-za-z0-9]{4,}/;
				if (!reg.test(value))
				{
					alert("5글자이상, 첫글자는 대문자이고, 영문자, 숫자만 가능");
					$('#userId').val('');
				}
	
			});
	
			$('#check_pw').keyup(function() {
				var pw1 = $('#password').val().trim();
				if (pw1 == "") {
					alert("패스워드를 입력하세요");
	
					$('#check_pw').val('');
					$('#password').focus();
	
				}
	
				var pw2 = $('#check_pw').val().trim();
				if (pw1.length != 0 && pw2.length != 0) {
					if (pw1 == pw2)
					{
						$('#out').html("패스워드가 일치합니다.");
						$('#out').css({
							'color' : 'green',
							'font-weight' : 'bolder'
						});
					}
	
					else {
						$('#out').html("패스워드가 일치하지 않습니다.");
						$('#out').css({
							'color' : 'red',
							'font-weight' : 'bolder'
						});
					}
				}
			});
	
			$("form").submit(function() {
	
				var rcheck = $(".gender1:checked").length;
				if (rcheck == 0) {
					alert("성별을 선택하세요");
					return false;
				}
	
			})
		});
		
	</script>

	<style>
		form ul {
			list-style: none;
		}
		
		form ul>li {
			text-align: right;
			width: 100px;
			display: inline-block;
			margin-right: 5px
		}
		
		form li:last-child {
			width: 300px;
			text-align: center;
		}
	</style>

</head>

<body>
	<form action="result.html" method="post">
		<fieldset>
			<legend>회원가입</legend>
			<ul>
				<li><label for="userId">아이디</label></li>
				<li><input type="text" name='userId' id="userId" size='10' required></li>
				<br>
				<li><label for="password">패스워드</label></li>
				<li><input type="password" name='password' id="password" size='10' required></li>
				<span id="out"></span>
				<br>
				<li><label for='check_pw'>패스워드확인</label></li>
				<li><input type="password" id="check_pw" size='10' required></li>
				<br>
				<li><label for='userName'>이름</label></li>
				<li><input type="text" name='userName' id="userName" size='10' required></li>
				<br>
				<li>성별</li>
				<li>
				<label>남<input type="radio" name='gender' class="gender1" value="M"></label> 
				<label>여<input type="radio" name='gender' class="gender1" value="F"></label>
				</li>
				<br>

				<li><label for='email'>이메일</label></li>

				<li><input type="email" name='email' id="email" size='10' required></li>
				<br>
				<br>

				<li><input type="submit" value="회원가입"> <input type="reset" value="취소"></li>
			</ul>

		</fieldset>

	</form>

</body>

</html>