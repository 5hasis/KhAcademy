<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="UTF-8">

<title>네비게이션</title>

	<style>
	.navi {
		display:flex;
	}
	.navi>li{
		background-color: black;
		list-style-type: none;
		width: 100px;
		height: 50px;
		text-align: center;
	}
	
	.navi>li>a{
		color: white;
		text-decoration: none;
		line-height: 50px;
		width: 150%;
		height: 100%;
	}
	
	.navi>li:hover>a{
		font-size: 1.2em;
		font-weight: bold;
	}
	
	</style>
</head>

<body>
	
	<ul class="navi">
		
		<li><a href="/html5.html">HTML5</a></li>
		<li><a href="/css3.html">CSS3</a></li>
		<li><a href="/javascript.html">JavaScript</a></li>
		<li><a href="/jQuery.html">jQuery</a></li>
	
	</ul>

</body>

</html>