<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	fieldset{
		width : 700px;
		height : 200px;
	}

	span{
		color : blue;
	}
</style>

</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"></script>

<form action="/memberLogin.do" method="post">
	<fieldset>
		<legend>회원가입</legend>
		
			회원 ID : <input type="text" name="userId" placeholder="ID를 입력하세요"/><span></span><br>
			
			회원 PW : <input type="password" name="userPw" placeholder="PW를 입력하세요"/><span></span><br>
			
			회원 PW확인 : <input type="password" name="userPw_re" placeholder="PW를 입력하세요"/><span></span><br>
			
			회원 이름 : <input type="text" name="userName" placeholder="이름을 입력하세요"/><span></span><br>
			
			성별 : <input type="radio" name="gender" checked/>남 <input type="radio" name="gender"/>여 <br><br><br>
			
			<input type="submit" value="회원가입"/> <input type="reset" value="취소"/>
		
	</fieldset>
</form>

<script>

$(function(){

	$("form").submit(function(){
		var $id = $('input[name=userId]');
		var $pw = $('input[name=userPw]');
		var $pw_re = $('input[name=userPw_re]');
		var $name = $('input[name=userName]');

		if(!(/^[a-z][a-z0-9]{3,9}$/.test($id.val()))) {
		
			alert('ID를 다시 확인하고 입력해주세요');
			return false;
		
		}
		else if(!(/[a-zA-Z0-9]{8,12}$/.test($pw.val()))) {

			alert('PW를 다시 확인하고 입력해주세요');
			return false;
			
		}
		else if($pw.val() != $pw_re.val() ) {

			alert('PW와 동일하게 입력해주세요');
			return false;
		}
		else if(!(/[가-힣]{2,5}$/.test($name.val()))) {

			alert('이름 입력을 다시 확인하고 입력해주세요');
			return false;
		}

			return true;

		});

		$('input[name]').focusin(function(){
		
			$(this).css('background-color','skyblue');
			
			switch($(this).attr('name')){
				case "userId" : $(this).next().text('소문자 시작, 소문자 및 숫자로 4~10글자만 입력 해주세요'); break;
				case "userPw" : $(this).next().text('소문자, 대문자, 숫자로 8~12글자만 입력 해주세요'); break;
				case "userPw_re" :$(this).next().text('비밀번호 재입력'); break;
				case "userName" :$(this).next().text('한글로만 2~5글자 입력 해주세요'); break;
			}
		
		});

		$('input[name]').focusout(function(){
			
			$(this).css('background-color','white');
			$(this).next().text("");
		
		});

});

</script>

</body>

</html>