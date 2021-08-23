<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
		.kakao-map{
			border:1px solid black;
			width:500px;
			height:400px;
		}
	</style>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=dae22632b7dd426a1c2ff21187e3453e"></script>
	<script>
		function loadMap(){
			
			//지도를 표시할 영역을 선택하는 코드
			var container = document.querySelector(".kakao-map"); //지도를 담을 영역의 DOM 레퍼런스
			
			var position  = new kakao.maps.LatLng(33.450701, 126.570667);
			
			//지도의 표시 옵션을 설정하는 코드
			var options = { //지도를 생성할 때 필요한 기본 옵션
				center: position, //지도의 중심좌표.
				level: 3 //지도의 레벨(확대, 축소 정도)
			};
		 
			//지도 생성 및 객체 리턴
			var map = new kakao.maps.Map(container, options); 

			// 마커를 생성합니다
			var marker = new kakao.maps.Marker({
			    position: position //이름 : 변수
			});

			// 마커가 지도 위에 표시되도록 설정합니다
			marker.setMap(map);

			// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
			// marker.setMap(null);    
		}
		
		function searchAddress(){
			//1.주소창의 입력값을 불러온ㄷ
			var addressInput = document.querySelector("input[name=address]");
			var address = addressInput.value;
			
			//2.입력값이 올바른지 검사(미입력 배제)
			if(){
				window.alert
			}
			
			//3.
			
		}
	</script>
</head>
<!-- onload는 로딩이 완료된 시점을 의미 -->
<body onload="loadMap();">
	<input type="text" name="address" placeholder="주소입력">
	<input type="button"value="검색" onclick="searchAddress();">
	<div class="kakao-map">
	</div>
</body>
</html>