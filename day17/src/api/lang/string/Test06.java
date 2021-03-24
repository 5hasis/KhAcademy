package api.lang.string;

public class Test06 {
	public static void main(String[] args) {
		//문자열 편집 : 문자열에 인위적인 조작을 가하여 새로운 문자열을 만들어내는 명령
		
		String word = "Hello World";
		
		//대소문자 변환
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
		
		System.out.println(word);
		
		//잘라내기
		String url = "www.naver,com";
		
		System.out.println(url.substring(4)); //+4지점부터 끝까지 잘라내기
		System.out.println(url.substring(4, 9));//+4부터 +9전까지 
		
		//여백제거 : 첫글자 앞과 마지막 글자 뒤의 불필요한 띄어쓰기
		String keyword = "     안녕 하세요     ";
		System.out.println(keyword.trim().length());
		
		//치환
		String str = "오늘 점심은 피자다";
		System.out.println(str.replace("피자", "파스타"));
		
		
		
		
		
	}
}
