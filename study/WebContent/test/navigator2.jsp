<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="UTF-8">

<title>네비게이션</title>

	<style>
	.navi {
		width:700px;
		height:50px;
		padding:0px;
	}
	.navi>li{
		float:left;
		list-style-type: none;
		width: 25%;
		height: 100%;
		line-height:50px;
	}
	
	.navi>li>a{
		display:block;
		width: 100%;
		height: 100%;
		background-color:black;
		color: white;
		text-align:center;
		text-decoration:none;
	}
	
	.navi>li>a:hover{
		font-size: 1.3em;
		font-weight: bold;
		background-color:#212121;
	}
	
	</style>
</head>

<body>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<ul class="navi">
		<li><a href="/html5.html">HTML5</a></li>
		<li><a href="/css3.html">CSS3</a></li>
		<li><a href="/javascript.html">JavaScript</a></li>
		<li><a href="/jQuery.html">jQuery</a></li>
	</ul>
	<script>
		$(function(){
			$('a').click(function(){
				alert($(this).text()+"페이지로 이동합니다.");
			});
		});
	</script>
</body>

</html>