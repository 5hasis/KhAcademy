//목표 : .confirm-link를 누르면 확인창 출력 후 "예"를 누를때에만 이동 처리
$(function(){
	$("a.confirm-link").click(function(e){
		//var message = $(this).attr("data-message"); //prompt 와의 차이
		var message = $(this).data("message") || "정말 이동하시겠습니까?";
		
		var choice = window.confirm(message);
		if(!choice){
			e.preventDefault(); //return false와의 차이점 뒤에 코드를 쓸수 잇는지
		}
	});
});