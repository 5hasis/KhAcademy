<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>이미지 스타일링</title>
	<!-- 기존에 만들어둔 스타일시트를 불러오는 코드 -->
	<link rel="stylesheet" type="text/css" href="/study/design/common.css">
	<style>
		/*
			공용 스타일
			- .image
		
			확장 스타일
			- .image-circle : 이미지를 원형으로 표시
			- .image-frame : 이미지에 액자처럼 테두리 표시
			- .image-shadow : 이미지에 그림자를 표시
			- .image-blur : 이미지를 뿌옇게 표시(단, 마우스가 올라가면 선명하게 표시)
			- .image-leaf : 이미지를 나뭇잎 모양으로 표시
		*/
		.image {
		
		}
		.image.image-circle {
			border-radius: 50%;
		}
		.image.image-frame {
			border: 2px solid gray;
		}
		.image.image-shadow {
			/* box-shadow : X위치 Y위치 번짐정도 퍼짐정도 색상; */
			box-shadow: 0px 0px 4px 4px gray;
		}
		.image.image-blur {
			/* opacity가 1이면 선명 , 0이면 투명 */
			opacity:0.5;
		}
		/* class="image-blur" 인 항목에 마우스가 올라가면(hover) : 상태선택자 */
		.image.image-blur:hover {
			opacity: 1;
		}
		
		.image.image-leaf {
			border-top-left-radius: 50%;
			border-bottom-right-radius: 50%;
		}
	</style>
</head>
<body>
	
	<img class="image image-circle" alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img class="image image-frame" alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img class="image image-circle image-frame" alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img class="image image-shadow" alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img class="image image-blur" alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img class="image image-circle image-frame image-blur" alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img class="image image-leaf" alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	<img alt="귀여운동물" src="/study/image/animal.jpg" width="200" height="200">
	
</body>
</html>